package com.friendsystem.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.friendsystem.DTO.Article_DetailsDTO;
import com.friendsystem.DTO.User_ArticleDTO;
import com.friendsystem.mapper.ArticleMapper;
import com.friendsystem.mapper.LikesMapper;
import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.ArticleExample;
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

	/**
	 * 查询更多作者
	 * 
	 * @return listMoreUsers
	 */
	public List<User_ArticleDTO> getMoreAuthou() {
		List<User_ArticleDTO> listMoreUsers = new ArrayList<>();
		List<User> listUsers = new ArrayList<>();
		listUsers = userMapper.getMoreRandomUsers();
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
				User userLike = userMapper.selectByPrimaryKey(likes.getLikepeople());
				listUserLike.add(userLike);// 把遍历的人塞到集合
			}
			article_DetailsDTO.setListUserByLike(listUserLike);
			article_DetailsDTO.setLike(likeByArticle);// 插入所有点赞的用户
			// 得到作者获得的所有赞
			ArticleExample articleExample = new ArticleExample();
			com.friendsystem.pojo.ArticleExample.Criteria criteria2 = articleExample.createCriteria();
			criteria2.andArticleByUserEqualTo(user.getUserId());
			List<Article> listAllArticleByUser = articleMapper.selectByExample(articleExample);
			if (listAllArticleByUser.size() > 0) {
				for (Article article2 : listAllArticleByUser) {
					// 遍历文章所得到的赞
					LikesExample likeExample2 = new LikesExample();
					com.friendsystem.pojo.LikesExample.Criteria criteria3 = likeExample.createCriteria();
					criteria3.andLikearticleEqualTo(article2.getArticleId());
					int likeByArticle2 = likeMapper.countByExample(likeExample2);
					int all = 0;
					all = all + likeByArticle2;
					for (int i = 0; i <= listAllArticleByUser.size(); i++) {
						// 如果i等于集合的长度，吧all加入到DTO中
						System.out.println("size:" + i);
						if (i == listAllArticleByUser.size()) {
							article_DetailsDTO.setAllLike(all);// 插入作者得到的所有赞
						}
					}
				}
			}
			return article_DetailsDTO;
		}
		return null;

	}
}
