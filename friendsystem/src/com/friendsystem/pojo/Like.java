package com.friendsystem.pojo;

/**
 * 点赞表
 * 
 * @author LW
 *
 */
public class Like {
	/**
	 * 点赞ID
	 */
	private String likeId;
	/**
	 * 点赞的文章ID
	 */
	private String likeArticle;
	/**
	 * 点赞人ID
	 */
	private String likePeople;
	/**
	 * 创建时间
	 */
	private String likeCreatetime;
	/**
	 * 修改时间
	 */
	private String likeModifytime;

	public String getLikeId() {
		return likeId;
	}

	public void setLikeId(String likeId) {
		this.likeId = likeId == null ? null : likeId.trim();
	}

	public String getLikeArticle() {
		return likeArticle;
	}

	public void setLikeArticle(String likeArticle) {
		this.likeArticle = likeArticle == null ? null : likeArticle.trim();
	}

	public String getLikePeople() {
		return likePeople;
	}

	public void setLikePeople(String likePeople) {
		this.likePeople = likePeople == null ? null : likePeople.trim();
	}

	public String getLikeCreatetime() {
		return likeCreatetime;
	}

	public void setLikeCreatetime(String likeCreatetime) {
		this.likeCreatetime = likeCreatetime == null ? null : likeCreatetime.trim();
	}

	public String getLikeModifytime() {
		return likeModifytime;
	}

	public void setLikeModifytime(String likeModifytime) {
		this.likeModifytime = likeModifytime == null ? null : likeModifytime.trim();
	}
}