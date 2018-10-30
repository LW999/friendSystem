package com.friendsystem.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.friendsystem.controller.DTO.Article_Like_CollectionDTO;
import com.friendsystem.controller.DTO.User_LikeDTO;
import com.friendsystem.mapper.ArticleMapper;
import com.friendsystem.mapper.CollectionMapper;
import com.friendsystem.mapper.LikeMapper;
import com.friendsystem.mapper.ProjectMapper;
import com.friendsystem.mapper.RecommendedMapper;
import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.ArticleExample;
import com.friendsystem.pojo.Collection;
import com.friendsystem.pojo.CollectionExample;
import com.friendsystem.pojo.Like;
import com.friendsystem.pojo.LikeExample;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.ProjectExample;
import com.friendsystem.pojo.ProjectExample.Criteria;
import com.friendsystem.pojo.Recommended;
import com.friendsystem.pojo.RecommendedExample;
import com.friendsystem.pojo.User;;

@Service("homeService")
public class HomeService {
	@Resource
	private ArticleMapper articleMapper;// 文章DAO
	@Resource
	private ProjectMapper projectMapper;// 专题DAO
	@Resource
	private RecommendedMapper recommendedMapper;// 推荐DAO
	@Resource
	private LikeMapper likeMapper;// 点赞DAO
	@Resource
	private CollectionMapper collectionMapper;// 收藏DAO
	@Resource
	private UserMapper userMapper;// 用户DAO

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
			System.err.println("随机：" + listArticle);
			for (Article article : listArticle) {
				LikeExample likeExample = new LikeExample();
				com.friendsystem.pojo.LikeExample.Criteria criteria = likeExample.createCriteria();
				criteria.andLikeArticleEqualTo(article.getArticleId());
				int likeNumber = likeMapper.countByExample(likeExample);// 得到所有点赞的人数
				CollectionExample collectionExample = new CollectionExample();
				com.friendsystem.pojo.CollectionExample.Criteria criteria2 = collectionExample.createCriteria();
				criteria2.andCollectionArticleEqualTo(article.getArticleId());
				int collectionNumber = collectionMapper.countByExample(collectionExample);// 得到收藏人数
				Article_Like_CollectionDTO ALCDTO = new Article_Like_CollectionDTO();
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
	 * 
	 * @return listRandomUsers
	 */
	public List<User_LikeDTO> getRandomUsers() {
		List<User_LikeDTO> listRandomUsers = new ArrayList<>();
		List<User> listUsers = new ArrayList<>();
		listUsers = userMapper.getRandomUsers();
		// 先遍历用户，然后遍历用户写的文章，遍历文章得到的赞
		if (listUsers.size() > 0) {
			for (User user : listUsers) {
				User_LikeDTO ULDTO = new User_LikeDTO();
				ArticleExample articleExample = new ArticleExample();
				com.friendsystem.pojo.ArticleExample.Criteria criteria = articleExample.createCriteria();
				criteria.andArticleByUserEqualTo(user.getUserId());
				List<Article> listArticleByUser = articleMapper.selectByExample(articleExample);// 得到用户所写的文章
				if (listArticleByUser.size() > 0) {

					for (Article article : listArticleByUser) {
						// 遍历文章所得到的赞
						LikeExample likeExample = new LikeExample();
						com.friendsystem.pojo.LikeExample.Criteria criteria2 = likeExample.createCriteria();
						criteria2.andLikeArticleEqualTo(article.getArticleId());
						int likeByArticle = likeMapper.countByExample(likeExample);
						int all = 0;
						all = all + likeByArticle;
						for (int i = 0; i <= listUsers.size(); i++) {
							// 如果i等于集合的长度，吧all加入到DTO中
							System.out.println("size:" + i);
							if (i == listUsers.size()) {
								ULDTO.setLike(all);
							}
						}
					}
					ULDTO.setUser(user);
				}
			}
			return listRandomUsers;
		}
		return null;
	}

}
