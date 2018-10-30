package com.friendsystem.DTO;

import java.util.List;

import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.User;

/**
 * 文章详情
 * 
 * @author LW
 *
 */
public class Article_DetailsDTO {
	/**
	 * 文章作者
	 */
	private User user;
	/**
	 * 具体文章
	 */
	private Article article;
	/**
	 * 作者一共的点赞数
	 */
	private int allLike;
	/**
	 * 该文章喜欢的人数量
	 */
	private int like;
	/**
	 * 所有喜欢的人
	 */
	private List<User> listUserByLike;

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

	public int getAllLike() {
		return allLike;
	}

	public void setAllLike(int allLike) {
		this.allLike = allLike;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public List<User> getListUserByLike() {
		return listUserByLike;
	}

	public void setListUserByLike(List<User> listUserByLike) {
		this.listUserByLike = listUserByLike;
	}

	@Override
	public String toString() {
		return "Article_DetailsDTO [user=" + user + ", article=" + article + ", allLike=" + allLike + ", like=" + like
				+ ", listUserByLike=" + listUserByLike + "]";
	}

}
