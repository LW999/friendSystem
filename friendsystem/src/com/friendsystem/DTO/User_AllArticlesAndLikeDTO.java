package com.friendsystem.DTO;

import java.util.List;

import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.User;

/**
 * 用户获得的所有点赞数和所有文章
 * 
 * @author LW
 *
 */
public class User_AllArticlesAndLikeDTO {
	/**
	 * 用户
	 */
	private User user;
	/**
	 * 该用户的所有文章
	 */
	private List<Article> listA;
	/**
	 * 用户获得的所有点赞数
	 */
	private int like = 0;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Article> getListA() {
		return listA;
	}

	public void setListA(List<Article> listA) {
		this.listA = listA;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	@Override
	public String toString() {
		return "User_AllArticlesAndLikeDTO [user=" + user + ", listA=" + listA + ", like=" + like + "]";
	}

}
