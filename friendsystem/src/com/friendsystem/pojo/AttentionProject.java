package com.friendsystem.pojo;

public class AttentionProject {
    private String attentionProjectId;

    private String attentionProjectUser;

    private String attentionProjectCreatetime;

    private String attentionProjectModifytime;

    public String getAttentionProjectId() {
        return attentionProjectId;
    }

    public void setAttentionProjectId(String attentionProjectId) {
        this.attentionProjectId = attentionProjectId == null ? null : attentionProjectId.trim();
    }

    public String getAttentionProjectUser() {
        return attentionProjectUser;
    }

    public void setAttentionProjectUser(String attentionProjectUser) {
        this.attentionProjectUser = attentionProjectUser == null ? null : attentionProjectUser.trim();
    }

    public String getAttentionProjectCreatetime() {
        return attentionProjectCreatetime;
    }

    public void setAttentionProjectCreatetime(String attentionProjectCreatetime) {
        this.attentionProjectCreatetime = attentionProjectCreatetime == null ? null : attentionProjectCreatetime.trim();
    }

    public String getAttentionProjectModifytime() {
        return attentionProjectModifytime;
    }

    public void setAttentionProjectModifytime(String attentionProjectModifytime) {
        this.attentionProjectModifytime = attentionProjectModifytime == null ? null : attentionProjectModifytime.trim();
    }
}