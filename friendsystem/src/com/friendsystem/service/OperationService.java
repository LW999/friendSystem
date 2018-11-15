package com.friendsystem.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.friendsystem.DTO.Article_DetailsDTO;
import com.friendsystem.DTO.User_ArticleDTO;
import com.friendsystem.mapper.ArticleMapper;
import com.friendsystem.mapper.AttentionPeopleMapper;
import com.friendsystem.mapper.LikesMapper;
import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.ArticleExample;
import com.friendsystem.pojo.AttentionPeople;
import com.friendsystem.pojo.AttentionPeopleExample;
import com.friendsystem.pojo.Likes;
import com.friendsystem.pojo.LikesExample;
import com.friendsystem.pojo.LikesExample.Criteria;
import com.friendsystem.pojo.User;

@Service("operationService")
public class OperationService {
	@Resource
	private UserMapper userMapper;
	@Resource
	private ArticleMapper articleMapper;
	@Resource
	private LikesMapper likeMapper;
	@Resource
	private AttentionPeopleMapper attentionPeopleMapper;// 关注DAO

	/**
	 * 查询更多作者
	 * 
	 * @return listMoreUsers
	 */
	public List<User_ArticleDTO> getMoreAuthou(User userSession) {
		List<User_ArticleDTO> listMoreUsers = new ArrayList<>();
		List<User> listUsers = new ArrayList<>();
		if (userSession.getUserType().equals("tourists")) {
			// type为游客，随机五个人
			listUsers = userMapper.getMoreRandomUsers();
		}
		else {
			List<String> list = new ArrayList<String>();
			list.add(userSession.getUserId());
			List<AttentionPeople> listAttentionPeople = new ArrayList<>();
			AttentionPeopleExample attentionPeopleExample = new AttentionPeopleExample();
			com.friendsystem.pojo.AttentionPeopleExample.Criteria criteria = attentionPeopleExample.createCriteria();
			criteria.andAttentionPeopleUserOneEqualTo(userSession.getUserId());
			listAttentionPeople = attentionPeopleMapper.selectByExample(attentionPeopleExample);
			for (AttentionPeople attentionPeople : listAttentionPeople) {
				User userA = new User();
				userA = userMapper.selectByPrimaryKey(attentionPeople.getAttentionPeopleUserTwo());
				list.add(userA.getUserId());

			}
			listUsers = userMapper.getRandomUsersNoOneSelft(list);
		}
		if (listMoreUsers.size() > 0) {
			for (User user : listUsers) {
				List<Article> listArticle = articleMapper.getThreeArticle(user.getUserId());
				User_ArticleDTO UADTO = new User_ArticleDTO();
				if (listArticle.size() > 0) {
					UADTO.setListArticle(listArticle);
				}
				UADTO.setUser(user);
				listMoreUsers.add(UADTO);
			}
			return listMoreUsers;

		}
		return null;
	}

	/**
	 * 文章详情
	 * 
	 * @param article_Id
	 * @return article_DetailsDTO
	 */
	public Article_DetailsDTO getArticleDetail(String article_Id) {
		if (article_Id != null && article_Id.trim().length() > 0) {
			Article_DetailsDTO article_DetailsDTO = new Article_DetailsDTO();
			// 得到文章
			Article article = articleMapper.selectByPrimaryKey(article_Id);
			if (article != null) {
				article_DetailsDTO.setArticle(article);// 插入文章
			}
			// 得到作者
			User user = userMapper.selectByPrimaryKey(article.getArticleByUser());
			if (user != null) {
				article_DetailsDTO.setUser(user);// 插入作者
			}
			// 得到该文章所得到的赞
			LikesExample likeExample = new LikesExample();
			Criteria criteria = likeExample.createCriteria();
			criteria.andLikearticleEqualTo(article_Id);
			int likeByArticle = likeMapper.countByExample(likeExample);
			// 得到所有该文章点赞的人
			List<User> listUserLike = new ArrayList<>();
			List<Likes> listLike = likeMapper.selectByExample(likeExample);
			for (Likes likes : listLike) {
				// 遍历喜欢的人出来
				User userLike = new User();
				userLike = userMapper.selectByPrimaryKey(likes.getLikepeople());
				listUserLike.add(userLike);// 把遍历的人塞到集合
			}
			article_DetailsDTO.setListUserByLike(listUserLike);
			article_DetailsDTO.setLike(likeByArticle);// 插入所有点赞的用户
			// 得到作者获得的所有赞
			ArticleExample articleExample = new ArticleExample();
			com.friendsystem.pojo.ArticleExample.Criteria criteria2 = articleExample.createCriteria();
			criteria2.andArticleByUserEqualTo(user.getUserId());
			List<Article> listAllArticleByUser = articleMapper.selectByExample(articleExample);
			int i = 0;
			int all = 0;
			if (listAllArticleByUser.size() > 0) {
				for (Article article2 : listAllArticleByUser) {
					// 遍历文章所得到的赞
					LikesExample likeExample2 = new LikesExample();
					com.friendsystem.pojo.LikesExample.Criteria criteria3 = likeExample.createCriteria();
					criteria3.andLikearticleEqualTo(article2.getArticleId());
					int likeByArticle2 = likeMapper.countByExample(likeExample2);

					all = all + likeByArticle2;
					i++;
					// 如果i等于集合的长度，吧all加入到DTO中
					System.out.println("size:" + i);
					if (i == listAllArticleByUser.size()) {
						article_DetailsDTO.setAllLike(all);// 插入作者得到的所有赞
					}
				}
			}

			return article_DetailsDTO;
		}
		return null;

	}

	/**
	 * 给点击的文章加1浏览量
	 * 
	 * @param article_Id
	 */
	public void addView(String article_Id) {
		Article article = new Article();
		article = articleMapper.selectByPrimaryKey(article_Id);
		int view = Integer.parseInt(article.getArticleViews());
		view = view + 1;
		article.setArticleViews(view + "");
		articleMapper.updateByPrimaryKey(article);
	}

	/**
	 * 
	 * 根据文章ID获取该作者所获得的所有浏览量
	 * 
	 * @param article_Id
	 * @return
	 */
	public int getView(String article_Id) {
		User user = new User();
		Article article = new Article();
		article = articleMapper.selectByPrimaryKey(article_Id);
		user = userMapper.selectByPrimaryKey(article.getArticleByUser());
		List<Article> lArticles = new ArrayList<>();
		ArticleExample articleExample = new ArticleExample();
		com.friendsystem.pojo.ArticleExample.Criteria criteria = articleExample.createCriteria();
		criteria.andArticleByUserEqualTo(user.getUserId());
		lArticles = articleMapper.selectByExample(articleExample);
		int all = 0;
		for (Article article2 : lArticles) {
			int view = 0;
			view = Integer.parseInt(article2.getArticleViews());
			all = all + view;
		}
		return all;
	}
}
