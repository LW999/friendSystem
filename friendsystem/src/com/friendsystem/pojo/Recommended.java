package com.friendsystem.pojo;

/**
 * 
 * @author 哈哈哈哈哈哈 推荐表
 */
public class Recommended {
	/**
	 * t推荐ID
	 */
	private String recommendedId;
	/**
	 * 推荐文章
	 */
	private String recommendedByArticle;
	/**
	 * 推荐图片
	 * 
	 */
	private String recommendedImg;
	/**
	 * 创建时间
	 */
	private String recommendedCreatetime;
	/**
	 * 修改时间
	 */
	private String recommendedModifytime;

	public String getRecommendedId() {
		return recommendedId;
	}

	public void setRecommendedId(String recommendedId) {
		this.recommendedId = recommendedId == null ? null : recommendedId.trim();
	}

	public String getRecommendedByArticle() {
		return recommendedByArticle;
	}

	public void setRecommendedByArticle(String recommendedByArticle) {
		this.recommendedByArticle = recommendedByArticle == null ? null : recommendedByArticle.trim();
	}

	public String getRecommendedImg() {
		return recommendedImg;
	}

	public void setRecommendedImg(String recommendedImg) {
		this.recommendedImg = recommendedImg == null ? null : recommendedImg.trim();
	}

	public String getRecommendedCreatetime() {
		return recommendedCreatetime;
	}

	public void setRecommendedCreatetime(String recommendedCreatetime) {
		this.recommendedCreatetime = recommendedCreatetime == null ? null : recommendedCreatetime.trim();
	}

	public String getRecommendedModifytime() {
		return recommendedModifytime;
	}

	public void setRecommendedModifytime(String recommendedModifytime) {
		this.recommendedModifytime = recommendedModifytime == null ? null : recommendedModifytime.trim();
	}
}