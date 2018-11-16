package com.friendsystem.pojo;

/**
 * 
 * @author LW 文章表
 *
 */
public class Article {
	/**
	 * 文章ID
	 */
	private String articleId;
	/**
	 * 文章标题
	 */
	private String articleTitle;
	/**
	 * 文章内容
	 */
	private String articleContent;
	/**
	 * 文章作者
	 */
	private String articleByUser;
	/**
	 * 是否发布
	 */
	private String articleIsRelease;
	/**
	 * 是否删除
	 */
	private String articleIsDelete;
	/**
	 * 浏览流量
	 */
	private String articleViews;
	/**
	 * 文章图片
	 */
	private String articleImg;
	/**
	 * 文章创建时间
	 */
	private String articleCreatetime;
	/**
	 * 文章修改时间
	 */
	private String articleModifytime;
	/**
	 * 文章专题
	 */
	private String articleProject;
	/**
	 * 临时数据文章简介
	 */
	private String outline;

	public String getOutline() {
		return outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId == null ? null : articleId.trim();
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle == null ? null : articleTitle.trim();
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent == null ? null : articleContent.trim();
	}

	public String getArticleByUser() {
		return articleByUser;
	}

	public void setArticleByUser(String articleByUser) {
		this.articleByUser = articleByUser == null ? null : articleByUser.trim();
	}

	public String getArticleIsRelease() {
		return articleIsRelease;
	}

	public void setArticleIsRelease(String articleIsRelease) {
		this.articleIsRelease = articleIsRelease == null ? null : articleIsRelease.trim();
	}

	public String getArticleIsDelete() {
		return articleIsDelete;
	}

	public void setArticleIsDelete(String articleIsDelete) {
		this.articleIsDelete = articleIsDelete == null ? null : articleIsDelete.trim();
	}

	public String getArticleViews() {
		return articleViews;
	}

	public void setArticleViews(String articleViews) {
		this.articleViews = articleViews == null ? null : articleViews.trim();
	}

	public String getArticleImg() {
		return articleImg;
	}

	public void setArticleImg(String articleImg) {
		this.articleImg = articleImg == null ? null : articleImg.trim();
	}

	public String getArticleCreatetime() {
		return articleCreatetime;
	}

	public void setArticleCreatetime(String articleCreatetime) {
		this.articleCreatetime = articleCreatetime == null ? null : articleCreatetime.trim();
	}

	public String getArticleModifytime() {
		return articleModifytime;
	}

	public void setArticleModifytime(String articleModifytime) {
		this.articleModifytime = articleModifytime == null ? null : articleModifytime.trim();
	}

	public String getArticleProject() {
		return articleProject;
	}

	public void setArticleProject(String articleProject) {
		this.articleProject = articleProject == null ? null : articleProject.trim();
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", articleTitle=" + articleTitle + ", articleContent="
				+ articleContent + ", articleByUser=" + articleByUser + ", articleIsRelease=" + articleIsRelease
				+ ", articleIsDelete=" + articleIsDelete + ", articleViews=" + articleViews + ", articleImg="
				+ articleImg + ", articleCreatetime=" + articleCreatetime + ", articleModifytime=" + articleModifytime
				+ ", articleProject=" + articleProject + ", outline=" + outline + "]";
	}

}