package com.friendsystem.pojo;

public class AttentionPeople {
    private String attentionPeopleId;

    private String attentionPeopleUserOne;

    private String attentionPeopleUserTwo;

    private String attentionPeopleCreatetime;

    private String attentionPeopleModifytime;

    public String getAttentionPeopleId() {
        return attentionPeopleId;
    }

    public void setAttentionPeopleId(String attentionPeopleId) {
        this.attentionPeopleId = attentionPeopleId == null ? null : attentionPeopleId.trim();
    }

    public String getAttentionPeopleUserOne() {
        return attentionPeopleUserOne;
    }

    public void setAttentionPeopleUserOne(String attentionPeopleUserOne) {
        this.attentionPeopleUserOne = attentionPeopleUserOne == null ? null : attentionPeopleUserOne.trim();
    }

    public String getAttentionPeopleUserTwo() {
        return attentionPeopleUserTwo;
    }

    public void setAttentionPeopleUserTwo(String attentionPeopleUserTwo) {
        this.attentionPeopleUserTwo = attentionPeopleUserTwo == null ? null : attentionPeopleUserTwo.trim();
    }

    public String getAttentionPeopleCreatetime() {
        return attentionPeopleCreatetime;
    }

    public void setAttentionPeopleCreatetime(String attentionPeopleCreatetime) {
        this.attentionPeopleCreatetime = attentionPeopleCreatetime == null ? null : attentionPeopleCreatetime.trim();
    }

    public String getAttentionPeopleModifytime() {
        return attentionPeopleModifytime;
    }

    public void setAttentionPeopleModifytime(String attentionPeopleModifytime) {
        this.attentionPeopleModifytime = attentionPeopleModifytime == null ? null : attentionPeopleModifytime.trim();
    }
}