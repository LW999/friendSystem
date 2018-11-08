package com.friendsystem.DTO;

import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.User;

/**
 * 查询所有用户最新发表的文章
 * 
 * @author
 *
 */
public class AllUserArticleDTO {
	/**
	 * 关注的用户
	 */
	private User user;
	/***
	 * 用户发表的最新文章
	 */
	private Article article;
	/**
	 * 该文章获得的赞
	 */
	private int like = 0;

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "AllUserArticleDTO [user=" + user + ", article=" + article + ", like=" + like + "]";
	}

}
