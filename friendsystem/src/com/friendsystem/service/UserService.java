package com.friendsystem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.swing.JEditorPane;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.friendsystem.DTO.ALLUserAttentionDTO;
import com.friendsystem.DTO.AllUserArticleDTO;
import com.friendsystem.DTO.User_AllArticlesAndLikeDTO;
import com.friendsystem.mapper.ArticleMapper;
import com.friendsystem.mapper.AttentionPeopleMapper;
import com.friendsystem.mapper.AttentionProjectMapper;
import com.friendsystem.mapper.LikesMapper;
import com.friendsystem.mapper.ProjectMapper;
import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.ArticleExample;
import com.friendsystem.pojo.AttentionPeople;
import com.friendsystem.pojo.AttentionPeopleExample;
import com.friendsystem.pojo.AttentionPeopleExample.Criteria;
import com.friendsystem.pojo.AttentionProject;
import com.friendsystem.pojo.AttentionProjectExample;
import com.friendsystem.pojo.Likes;
import com.friendsystem.pojo.LikesExample;
import com.friendsystem.pojo.Project;
import com.friendsystem.util.BuildUuid;
import com.friendsystem.util.TimeUtil;
import com.friendsystem.pojo.User;
import com.friendsystem.pojo.UserExample;

/**
 * 用户的一些操作
 * 
 * @author LW
 *
 */
@Controller
@Service("userService")
public class UserService {
	@Resource
	private AttentionPeopleMapper aPeopleMapper;// 关注的人DAO
	@Resource
	private AttentionProjectMapper aProjectMapper;// 关注的专题DAO
	@Resource
	private UserMapper userMapper;// 用户DAO
	@Resource
	private ProjectMapper projectMapper;// 专题DAO
	@Resource
	private ArticleMapper articleMapper;// 文章DAO
	@Resource
	private LikesMapper likesMapper;// 点赞DAO

	/**
	 * 根据用户传回来的ID查询是否需要关注其他用户
	 * 
	 * @param userId
	 * @param userSession
	 * @return
	 */
	public String getMessage(String userId, User userSession) {
		if (userId != null && userId.trim().length() > 0) {
			System.out.println("SessionID:" + userSession.getUserId());
			// 根据传回来的用户ID和 自身ID查询是否关注了此人
			AttentionPeopleExample attentionPeopleExample = new AttentionPeopleExample();
			Criteria criteria = attentionPeopleExample.createCriteria();
			criteria.andAttentionPeopleUserOneEqualTo(userSession.getUserId());
			criteria.andAttentionPeopleUserTwoEqualTo(userId);
			List<AttentionPeople> listAP = aPeopleMapper.selectByExample(attentionPeopleExample);
			if (listAP.size() > 0) {
				// 已经关注，现在取消关注
				aPeopleMapper.deleteByPrimaryKey(listAP.get(0).getAttentionPeopleId());
				return "cancelAttention";
			} else {
				AttentionPeople attentionPeople = new AttentionPeople();
				attentionPeople.setAttentionPeopleId(BuildUuid.getUuid());
				attentionPeople.setAttentionPeopleUserOne(userSession.getUserId());
				attentionPeople.setAttentionPeopleUserTwo(userId);
				attentionPeople.setAttentionPeopleCreatetime(TimeUtil.getStringSecond());
				attentionPeople.setAttentionPeopleModifytime(TimeUtil.getStringSecond());
				aPeopleMapper.insert(attentionPeople);
				return "success";
			}
		}

		return "error";
	}

	/**
	 * 
	 * @param userSession
	 * @return ALLUserAttentionDTO 获得用户的所有关注
	 * 
	 */
	public ALLUserAttentionDTO getAllUserAttention(User userSession) {
		ALLUserAttentionDTO allUserAttentionDTO = new ALLUserAttentionDTO();
		List<AttentionPeople> listPeople = new ArrayList<>();
		List<AttentionProject> listProject = new ArrayList<>();
		List<Project> listP = new ArrayList<>();
		List<User> listU = new ArrayList<>();
		// 用户关注的专题
		AttentionProjectExample attentionProjectExample = new AttentionProjectExample();
		com.friendsystem.pojo.AttentionProjectExample.Criteria criteria1 = attentionProjectExample.createCriteria();
		criteria1.andAttentionProjectUserEqualTo(userSession.getUserId());
		// 用户关注的人
		AttentionPeopleExample attentionPeopleExample = new AttentionPeopleExample();
		Criteria criteria2 = attentionPeopleExample.createCriteria();
		criteria2.andAttentionPeopleUserOneEqualTo(userSession.getUserId());

		listPeople = aPeopleMapper.selectByExample(attentionPeopleExample);
		if (listPeople.size() > 0) {
			for (AttentionPeople attentionPeople : listPeople) {
				User user = new User();
				user = userMapper.selectByPrimaryKey(attentionPeople.getAttentionPeopleUserTwo());
				if (user != null) {
					listU.add(user);
				}
			}
		}
		listProject = aProjectMapper.selectByExample(attentionProjectExample);
		if (listProject.size() > 0) {
			for (AttentionProject attentionProject : listProject) {
				Project project = new Project();
				project = projectMapper.selectByPrimaryKey(attentionProject.getAttentionProjectProject());
				if (project != null) {
					listP.add(project);
				}
			}
		}
		allUserAttentionDTO.setListProject(listP);
		allUserAttentionDTO.setListPeople(listU);
		return allUserAttentionDTO;
	}

	/**
	 * 获得用户所有 关注的人的最新文章
	 * 
	 * @param userSession
	 * @return
	 */
	public List<AllUserArticleDTO> getAllUserArticle(User userSession) {
		List<AllUserArticleDTO> listAllUserArticleDTO = new ArrayList<>();
		AttentionPeopleExample attentionPeopleExample = new AttentionPeopleExample();
		Criteria criteria = attentionPeopleExample.createCriteria();
		criteria.andAttentionPeopleUserOneEqualTo(userSession.getUserId());
		List<AttentionPeople> listP = aPeopleMapper.selectByExample(attentionPeopleExample);
		// 点赞
		LikesExample likesExample = new LikesExample();
		com.friendsystem.pojo.LikesExample.Criteria criteria3 = likesExample.createCriteria();
		if (listP.size() > 0) {
			for (AttentionPeople attentionPeople : listP) {
				AllUserArticleDTO allUserArticleDTO = new AllUserArticleDTO();
				User user = new User();

				user = userMapper.selectByPrimaryKey(attentionPeople.getAttentionPeopleUserTwo());
				if (user != null) {
					List<Article> listA = new ArrayList<>();
					ArticleExample articleExample = new ArticleExample();
					com.friendsystem.pojo.ArticleExample.Criteria criteria2 = articleExample.createCriteria();
					criteria2.andArticleByUserEqualTo(user.getUserId());
					articleExample.setOrderByClause("article_createtime DESC LIMIT 1");
					listA = articleMapper.selectByExample(articleExample);
					if (listA.size() > 0) {

						// 获取该文章所获得的赞
						criteria3.andLikearticleEqualTo(listA.get(0).getArticleId());
						int like = likesMapper.countByExample(likesExample);
						allUserArticleDTO.setUser(user);
						allUserArticleDTO.setArticle(listA.get(0));
						allUserArticleDTO.setLike(like);
						listAllUserArticleDTO.add(allUserArticleDTO);
					}
				}
			}
		}

		return listAllUserArticleDTO;
	}

	/**
	 * 用户的所有文章和点赞数
	 * 
	 * @param user_Id
	 * @return
	 */
	public User_AllArticlesAndLikeDTO getUALDTO(String user_Id) {
		if (user_Id != null && user_Id.trim().length() > 0) {
			User_AllArticlesAndLikeDTO UADTO = new User_AllArticlesAndLikeDTO();
			User user = userMapper.selectByPrimaryKey(user_Id);
			ArticleExample aExample = new ArticleExample();
			com.friendsystem.pojo.ArticleExample.Criteria criteria = aExample.createCriteria();
			criteria.andArticleByUserEqualTo(user_Id);
			List<Article> listA = articleMapper.selectByExample(aExample);
			
			int all = 0;
			int i = 0;
			for (Article article : listA) {
				LikesExample likesExample = new LikesExample();
				com.friendsystem.pojo.LikesExample.Criteria criteria2 = likesExample.createCriteria();
				criteria2.andLikearticleEqualTo(article.getArticleId());
				int like = 0;
				like = likesMapper.countByExample(likesExample);
				all = like + all;
				i++;
				if (i == listA.size()) {
					System.out.println("hahhah ");
					UADTO.setLike(all);
				}

			}
			UADTO.setUser(user);
			UADTO.setListA(listA);
			return UADTO;
		}

		return null;
	}

}
