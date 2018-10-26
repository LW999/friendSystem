package com.friendsystem.pojo;

public class Recommended {
    private String recommendedId;

    private String recommendedByArticle;

    private String recommendedImg;

    private String recommendedCreatetime;

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