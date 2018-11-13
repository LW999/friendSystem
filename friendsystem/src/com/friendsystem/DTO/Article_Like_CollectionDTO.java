package com.friendsystem.DTO;

import java.util.List;

import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.Collection;
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

	@Override
	public String toString() {
		return "Article_Like_CollectionDTO [user=" + user + ", article=" + article + ", likeNumber=" + likeNumber
				+ ", collectionNumber=" + collectionNumber + "]";
	}

}
