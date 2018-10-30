package com.friendsystem.controller.DTO;

import java.util.List;

import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.User;

/**
 * 更多作者
 * 
 * @author LW
 *
 */
public class User_ArticleDTO {
	/**
	 * 作者
	 */
	private User user;
	/**
	 * 最近三篇文章
	 */
	private List<Article> listArticle;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Article> getListArticle() {
		return listArticle;
	}

	public void setListArticle(List<Article> listArticle) {
		this.listArticle = listArticle;
	}

	@Override
	public String toString() {
		return "User_ArticleDTO [user=" + user + ", listArticle=" + listArticle + "]";
	}

}
