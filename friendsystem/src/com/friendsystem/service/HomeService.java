package com.friendsystem.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.friendsystem.DTO.Article_Like_CollectionDTO;
import com.friendsystem.DTO.LikeDTO;
import com.friendsystem.DTO.UserLikeAndTimeDTO;
import com.friendsystem.DTO.User_LikeDTO;
import com.friendsystem.mapper.ArticleMapper;
import com.friendsystem.mapper.AttentionPeopleMapper;
import com.friendsystem.mapper.CollectionMapper;
import com.friendsystem.mapper.LikesMapper;
import com.friendsystem.mapper.ProjectMapper;
import com.friendsystem.mapper.RecommendedMapper;
import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.ArticleExample;
import com.friendsystem.pojo.AttentionPeople;
import com.friendsystem.pojo.AttentionPeopleExample;
import com.friendsystem.pojo.Collection;
import com.friendsystem.pojo.CollectionExample;
import com.friendsystem.pojo.Likes;
import com.friendsystem.pojo.LikesExample;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.ProjectExample;
import com.friendsystem.pojo.ProjectExample.Criteria;
import com.friendsystem.pojo.Recommended;
import com.friendsystem.pojo.RecommendedExample;
import com.friendsystem.pojo.User;
import com.friendsystem.util.BuildUuid;
import com.friendsystem.util.RemoveHTML;
import com.friendsystem.util.TimeUtil;;

@Service("homeService")
public class HomeService {
	@Resource
	private ArticleMapper articleMapper;// 文章DAO
	@Resource
	private ProjectMapper projectMapper;// 专题DAO
	@Resource
	private RecommendedMapper recommendedMapper;// 推荐DAO
	@Resource
	private LikesMapper likeMapper;// 点赞DAO
	@Resource
	private CollectionMapper collectionMapper;// 收藏DAO
	@Resource
	private UserMapper userMapper;// 用户DAO
	@Resource
	private AttentionPeopleMapper attentionPeopleMapper;// 关注DAO

	/**
	 * 查询所有专题
	 * 
	 * @return
	 */
	public List<Project> getAllProject() {
		ProjectExample projectExample = new ProjectExample();
		Criteria criteria = projectExample.createCriteria();
		List<Project> listProject = projectMapper.selectByExample(projectExample);
		if (listProject.size() > 0) {
			return listProject;
		}
		return null;
	}

	/**
	 * 查询所有推荐
	 * 
	 * @return listRecommended
	 */
	public List<Recommended> getRecommended() {
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKK");
		RecommendedExample recommendedExample = new RecommendedExample();
		com.friendsystem.pojo.RecommendedExample.Criteria criteria = recommendedExample.createCriteria();
		List<Recommended> listRecommended = recommendedMapper.selectByExample(null);
		if (listRecommended.size() > 0) {
			return listRecommended;
		}
		return null;
	}

	/**
	 * 
	 * @return listALCDTO
	 */
	public List<Article_Like_CollectionDTO> getRandomArticles() {
		List<Article_Like_CollectionDTO> listALCDTO = new ArrayList<>();
		List<Article> listArticle = articleMapper.selectByRand();// 得到十条随机文章
		if (listArticle.size() > 0) {
			for (Article article : listArticle) {
				LikesExample likeExample = new LikesExample();
				com.friendsystem.pojo.LikesExample.Criteria criteria = likeExample.createCriteria();
				criteria.andLikearticleEqualTo(article.getArticleId());
				int likeNumber = likeMapper.countByExample(likeExample);// 得到所有点赞的人数
				CollectionExample collectionExample = new CollectionExample();
				com.friendsystem.pojo.CollectionExample.Criteria criteria2 = collectionExample.createCriteria();
				criteria2.andCollectionArticleEqualTo(article.getArticleId());
				int collectionNumber = collectionMapper.countByExample(collectionExample);// 得到收藏人数
				Article_Like_CollectionDTO ALCDTO = new Article_Like_CollectionDTO();
				User user = new User();
				user = userMapper.selectByPrimaryKey(article.getArticleByUser());
				String outline = "";
				outline = RemoveHTML.Html2Text(article.getArticleContent());
				ALCDTO.setOutline(outline);
				ALCDTO.setUser(user);
				ALCDTO.setArticle(article);
				ALCDTO.setCollectionNumber(collectionNumber);
				ALCDTO.setLikeNumber(likeNumber);
				if (ALCDTO != null) {
					listALCDTO.add(ALCDTO);
				}
			}
			return listALCDTO;
		}
		return null;
	}

	/**
	 * 显示推荐作者
	 * 
	 * @return listRandomUsers
	 */
	public List<User_LikeDTO> getRandomUsers(User userSession) {
		List<User_LikeDTO> listRandomUsers = new ArrayList<>();
		List<User> listUsers = new ArrayList<>();
		if (userSession.getUserType().equals("tourists")) {
			// type为游客，随机五个人
			listUsers = userMapper.getRandomUsers();
		} else {
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
		// 先遍历用户，然后遍历用户写的文章，遍历文章得到的赞
		if (listUsers.size() > 0) {
			for (User user : listUsers) {
				User_LikeDTO ULDTO = new User_LikeDTO();
				ArticleExample articleExample = new ArticleExample();
				com.friendsystem.pojo.ArticleExample.Criteria criteria = articleExample.createCriteria();
				criteria.andArticleByUserEqualTo(user.getUserId());
				criteria.andArticleIsDeleteEqualTo("0");
				List<Article> listArticleByUser = articleMapper.selectByExample(articleExample);// 得到用户所写的文章
				// 定义点赞数
				int all = 0;
				int i = 0;
				for (Article article : listArticleByUser) {
					// 遍历文章所得到的赞
					LikesExample likeExample = new LikesExample();
					com.friendsystem.pojo.LikesExample.Criteria criteria2 = likeExample.createCriteria();
					criteria2.andLikearticleEqualTo(article.getArticleId());
					int likeByArticle = likeMapper.countByExample(likeExample);
					all = all + likeByArticle;
					i++;
					// 如果i等于集合的长度，吧all加入到DTO中
					if (i == listArticleByUser.size()) {
						ULDTO.setLike(all);
					}
				}
				ULDTO.setUser(user);
				listRandomUsers.add(ULDTO);
			}
			return listRandomUsers;
		}
		return null;
	}

	public LikeDTO getLikes(String article_Id, String user_Id) {
		LikeDTO likeDTO = new LikeDTO();
		String message = "";

		/* Article article = new Article(); */
		LikesExample likesExample = new LikesExample();
		com.friendsystem.pojo.LikesExample.Criteria criteria = likesExample.createCriteria();
		criteria.andLikepeopleEqualTo(user_Id);
		criteria.andLikearticleEqualTo(article_Id);
		List<Likes> listLike = likeMapper.selectByExample(likesExample);// 查询用户是否点赞
		LikesExample likesExample2 = new LikesExample();
		com.friendsystem.pojo.LikesExample.Criteria criteria2 = likesExample2.createCriteria();
		criteria2.andLikearticleEqualTo(article_Id);
		int likes = likeMapper.countByExample(likesExample2);// 该文章的点赞数
		if (listLike.size() > 0) {
			message = "cancel";
			likes = likes - 1;
			likeDTO.setLikes(likes);
			likeDTO.setMessage(message);
			likeMapper.deleteByPrimaryKey(listLike.get(0).getLikeid());

		} else {
			message = "success";
			likes = likes + 1;
			likeDTO.setLikes(likes);
			likeDTO.setMessage(message);
			Likes likes2 = new Likes();
			likes2.setLikeid(BuildUuid.getUuid());
			likes2.setLikearticle(article_Id);
			likes2.setLikecreatetime(TimeUtil.getStringSecond());
			likes2.setLikemodifytime(TimeUtil.getStringSecond());
			likes2.setLikepeople(user_Id);
			likeMapper.insert(likes2);
		}
		return likeDTO;
	}

	/**
	 * 查看文章点赞的有什么用户
	 * 
	 * @param article_Id
	 * @return
	 */
	public List<UserLikeAndTimeDTO> getUserLike(String article_Id) {
		List<UserLikeAndTimeDTO> listU = new ArrayList<>();

		List<Likes> listLike = new ArrayList<>();
		List<User> listUser = new ArrayList<>();
		LikesExample likesExample = new LikesExample();
		com.friendsystem.pojo.LikesExample.Criteria criteria = likesExample.createCriteria();
		criteria.andLikearticleEqualTo(article_Id);
		listLike = likeMapper.selectByExample(likesExample);
		if (listLike.size() > 0) {
			for (Likes likes : listLike) {
				UserLikeAndTimeDTO DTO = new UserLikeAndTimeDTO();
				User user = new User();
				user = userMapper.selectByPrimaryKey(likes.getLikepeople());
				DTO.setUser(user);
				DTO.setTime(likes.getLikecreatetime());
				listU.add(DTO);
			}
		}
		return listU;
	}
}
