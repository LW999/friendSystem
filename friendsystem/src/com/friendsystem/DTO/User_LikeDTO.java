package com.friendsystem.DTO;

import com.friendsystem.pojo.User;

public class User_LikeDTO {
	/**
	 * 作者文章点赞数
	 */
	private int like = 0;
	/**
	 * 作者
	 */
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	@Override
	public String toString() {
		return "User_LikeDTO [like=" + like + ", user=" + user + "]";
	}
	
}
