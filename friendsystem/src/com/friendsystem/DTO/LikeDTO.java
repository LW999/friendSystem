package com.friendsystem.DTO;

/**
 * 点赞DTO
 * 
 * @author LW
 *
 */
public class LikeDTO {
	private int likes = 0;
	private String message;

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LikeDTO [likes=" + likes + ", message=" + message + "]";
	}

}
