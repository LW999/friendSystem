package com.friendsystem.pojo;

public class Likes {
    private String likeid;

    private String likearticle;

    private String likepeople;

    private String likecreatetime;

    private String likemodifytime;

    public String getLikeid() {
        return likeid;
    }

    public void setLikeid(String likeid) {
        this.likeid = likeid == null ? null : likeid.trim();
    }

    public String getLikearticle() {
        return likearticle;
    }

    public void setLikearticle(String likearticle) {
        this.likearticle = likearticle == null ? null : likearticle.trim();
    }

    public String getLikepeople() {
        return likepeople;
    }

    public void setLikepeople(String likepeople) {
        this.likepeople = likepeople == null ? null : likepeople.trim();
    }

    public String getLikecreatetime() {
        return likecreatetime;
    }

    public void setLikecreatetime(String likecreatetime) {
        this.likecreatetime = likecreatetime == null ? null : likecreatetime.trim();
    }

    public String getLikemodifytime() {
        return likemodifytime;
    }

    public void setLikemodifytime(String likemodifytime) {
        this.likemodifytime = likemodifytime == null ? null : likemodifytime.trim();
    }
}