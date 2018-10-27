package com.friendsystem.pojo;

public class Like {
    private String likeId;

    private String likeArticle;

    private String likePeople;

    private String likeCreatetime;

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