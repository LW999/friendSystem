package com.friendsystem.DTO;

import java.util.List;

import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.Collection;

/**
 * 一篇文章和点赞数+收藏数
 * 
 * @author LW
 *
 */
public class Article_Like_CollectionDTO {
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

	@Override
	public String toString() {
		return "Article_Like_CollectionDTO [article=" + article + ", likeNumber=" + likeNumber + ", collectionNumber="
				+ collectionNumber + "]";
	}

}
