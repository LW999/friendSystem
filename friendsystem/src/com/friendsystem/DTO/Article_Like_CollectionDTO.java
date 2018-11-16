package com.friendsystem.DTO;


import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.User;

/**
 * 一篇文章和点赞数+收藏数+作者
 * 
 * @author LW
 *
 */
public class Article_Like_CollectionDTO {
	private User user;
	/**
	 * 文章
	 */
	private Article article;
	/**
	 * 该文章的点赞数
	 */
	private int likeNumber;
	/**
	 * 该文章的收藏数
	 */
	private int collectionNumber;
	/**
	 * 文章简介
	 */
	private String outline = "";

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getLikeNumber() {
		return likeNumber;
	}

	public void setLikeNumber(int likeNumber) {
		this.likeNumber = likeNumber;
	}

	public int getCollectionNumber() {
		return collectionNumber;
	}

	public void setCollectionNumber(int collectionNumber) {
		this.collectionNumber = collectionNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOutline() {
		return outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	@Override
	public String toString() {
		return "Article_Like_CollectionDTO [user=" + user + ", article=" + article + ", likeNumber=" + likeNumber
				+ ", collectionNumber=" + collectionNumber + ", outline=" + outline + "]";
	}


}
