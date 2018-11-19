package com.friendsystem.DTO;

import com.friendsystem.pojo.User;
import com.sun.glass.ui.View;

/**
 * 用户关注的人需要的DTO
 * 
 * @author LW
 *
 */
public class UserAttentionDTO {
	private User user;
	private int attention;
	private int fans;
	private int article;
	private int view;
	private int likes;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getAttention() {
		return attention;
	}

	public void setAttention(int attention) {
		this.attention = attention;
	}

	public int getFans() {
		return fans;
	}

	public void setFans(int fans) {
		this.fans = fans;
	}

	public int getArticle() {
		return article;
	}

	public void setArticle(int article) {
		this.article = article;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "UserAttentionDTO [user=" + user + ", attention=" + attention + ", fans=" + fans + ", article=" + article
				+ ", view=" + view + ", likes=" + likes + "]";
	}

}
