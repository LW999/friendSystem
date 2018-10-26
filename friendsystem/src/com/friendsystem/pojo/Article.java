package com.friendsystem.pojo;

public class Article {
    private String articleId;

    private String articleTitle;

    private String articleContent;

    private String articleByUser;

    private String articleIsRelease;

    private String articleIsDelete;

    private String articleViews;

    private String articleImg;

    private String articleCreatetime;

    private String articleModifytime;

    private String articleProject;

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
}