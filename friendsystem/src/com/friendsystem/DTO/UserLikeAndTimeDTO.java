package com.friendsystem.DTO;

import java.util.List;

import com.friendsystem.pojo.User;

/**
 * 文章点赞用户和点赞时间
 * 
 * @author 哈哈哈哈哈哈
 */
public class UserLikeAndTimeDTO {
	/**
	 * 点赞的用户
	 */
	private User user;
	/**
	 * 点赞时间
	 */
	private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserLikeAndTimeDTO [user=" + user + ", time=" + time + "]";
	}


}
