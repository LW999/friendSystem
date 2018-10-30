package com.friendsystem.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.friendsystem.DTO.Article_DetailsDTO;
import com.friendsystem.DTO.User_ArticleDTO;
import com.friendsystem.mapper.ArticleMapper;
import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.User;

@Service("operationService")
public class OperationService {
	@Resource
	private UserMapper userMapper;
	@Resource
	private ArticleMapper articleMapper;

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
			Article article = articleMapper.selectByPrimaryKey(article_Id);
			

		}

		return null;
	}

}
