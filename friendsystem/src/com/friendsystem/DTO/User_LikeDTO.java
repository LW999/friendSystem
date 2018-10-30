package com.friendsystem.DTO;

import com.friendsystem.pojo.User;

public class User_LikeDTO {
	/**
	 * 作者文章点赞数
	 */

	private int Like;
	/**
	 * 作者
	 */
	public User user;

	public int getLike() {
		return Like;
	}

	public void setLike(int like) {
		Like = like;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "User_LikeDTO [Like=" + Like + ", user=" + user + "]";
	}

}
