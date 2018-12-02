package com.friendsystem.pojo;

public class Comment {
	/**
	 * 评论ID
	 */
	private String commentId;
	/**
	 * 评论内容
	 */
	private String commentContent;
	/**
	 * 评论楼层
	 */
	private Integer commentFloor;
	/**
	 * 文章ID
	 */
	private String commentNoteId;
	/**
	 * 评论用户一
	 */
	private String commentUseroneId;
	/**
	 * 评论用户二
	 */
	private String commentUsertwoId;
	/**
	 * 一级或者二级
	 */
	private Integer commentIsGrade;
	/**
	 * 创建时间
	 */
	private String commentCreateAt;
	/**
	 * 一级评论ID
	 */
	private String commentParentId;

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId == null ? null : commentId.trim();
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent == null ? null : commentContent.trim();
	}

	public Integer getCommentFloor() {
		return commentFloor;
	}

	public void setCommentFloor(Integer commentFloor) {
		this.commentFloor = commentFloor;
	}

	public String getCommentNoteId() {
		return commentNoteId;
	}

	public void setCommentNoteId(String commentNoteId) {
		this.commentNoteId = commentNoteId == null ? null : commentNoteId.trim();
	}

	public String getCommentUseroneId() {
		return commentUseroneId;
	}

	public void setCommentUseroneId(String commentUseroneId) {
		this.commentUseroneId = commentUseroneId == null ? null : commentUseroneId.trim();
	}

	public String getCommentUsertwoId() {
		return commentUsertwoId;
	}

	public void setCommentUsertwoId(String commentUsertwoId) {
		this.commentUsertwoId = commentUsertwoId == null ? null : commentUsertwoId.trim();
	}

	public Integer getCommentIsGrade() {
		return commentIsGrade;
	}

	public void setCommentIsGrade(Integer commentIsGrade) {
		this.commentIsGrade = commentIsGrade;
	}

	public String getCommentCreateAt() {
		return commentCreateAt;
	}

	public void setCommentCreateAt(String commentCreateAt) {
		this.commentCreateAt = commentCreateAt == null ? null : commentCreateAt.trim();
	}

	public String getCommentParentId() {
		return commentParentId;
	}

	public void setCommentParentId(String commentParentId) {
		this.commentParentId = commentParentId == null ? null : commentParentId.trim();
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentContent=" + commentContent + ", commentFloor="
				+ commentFloor + ", commentNoteId=" + commentNoteId + ", commentUseroneId=" + commentUseroneId
				+ ", commentUsertwoId=" + commentUsertwoId + ", commentIsGrade=" + commentIsGrade + ", commentCreateAt="
				+ commentCreateAt + ", commentParentId=" + commentParentId + "]";
	}

}