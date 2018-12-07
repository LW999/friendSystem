package com.friendsystem.DTO;

import java.util.List;

import com.friendsystem.pojo.Comment;
import com.friendsystem.pojo.User;

/**
 * 评论DTO
 * 
 * @author LW
 *
 */
public class CommentDTO {
	/**
	 * 用户一
	 */
	private User userOne;
	/**
	 * 用户二
	 */
	private User userTWo;
	/**
	 * 一级评论
	 */
	private Comment comment;
	/**
	 * 是否有二级
	 */
	private int comment_exist = 0;// 1 或者 0
	/**
	 * 二级评论
	 */
	private List<CommentDTO> listCommentDTO;

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public int getComment_exist() {
		return comment_exist;
	}

	public void setComment_exist(int comment_exist) {
		this.comment_exist = comment_exist;
	}

	public List<CommentDTO> getListCommentDTO() {
		return listCommentDTO;
	}

	public void setListCommentDTO(List<CommentDTO> listCommentDTO) {
		this.listCommentDTO = listCommentDTO;
	}

	public User getUserOne() {
		return userOne;
	}

	public void setUserOne(User userOne) {
		this.userOne = userOne;
	}

	public User getUserTWo() {
		return userTWo;
	}

	public void setUserTWo(User userTWo) {
		this.userTWo = userTWo;
	}

	@Override
	public String toString() {
		return "CommentDTO [userOne=" + userOne + ", userTWo=" + userTWo + ", comment=" + comment + ", comment_exist="
				+ comment_exist + ", listCommentDTO=" + listCommentDTO + "]";
	}

}
