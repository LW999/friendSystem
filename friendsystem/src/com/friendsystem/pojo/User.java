package com.friendsystem.pojo;

public class User {
    private String userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userAccount;

    private String userSex;

    private String userWechat;

    private String userType;

    private String userIsBanned;

    private String userPortrait;

    private String userSynopsis;

    private String userCreatetime;

    private String userModifytime;

    private String userIsActivation;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat == null ? null : userWechat.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserIsBanned() {
        return userIsBanned;
    }

    public void setUserIsBanned(String userIsBanned) {
        this.userIsBanned = userIsBanned == null ? null : userIsBanned.trim();
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait == null ? null : userPortrait.trim();
    }

    public String getUserSynopsis() {
        return userSynopsis;
    }

    public void setUserSynopsis(String userSynopsis) {
        this.userSynopsis = userSynopsis == null ? null : userSynopsis.trim();
    }

    public String getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(String userCreatetime) {
        this.userCreatetime = userCreatetime == null ? null : userCreatetime.trim();
    }

    public String getUserModifytime() {
        return userModifytime;
    }

    public void setUserModifytime(String userModifytime) {
        this.userModifytime = userModifytime == null ? null : userModifytime.trim();
    }

    public String getUserIsActivation() {
        return userIsActivation;
    }

    public void setUserIsActivation(String userIsActivation) {
        this.userIsActivation = userIsActivation == null ? null : userIsActivation.trim();
    }
}