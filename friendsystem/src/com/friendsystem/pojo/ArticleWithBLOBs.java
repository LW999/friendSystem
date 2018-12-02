package com.friendsystem.pojo;

public class ArticleWithBLOBs extends Article {
    private String articleContent;

    private String articleOutline;

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public String getArticleOutline() {
        return articleOutline;
    }

    public void setArticleOutline(String articleOutline) {
        this.articleOutline = articleOutline == null ? null : articleOutline.trim();
    }
}