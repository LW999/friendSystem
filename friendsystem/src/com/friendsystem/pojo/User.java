package com.friendsystem.pojo;

/**
 * 用户表
 * 
 */
public class User {
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 用户昵称
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String userPassword;
	/**
	 * 电子邮箱
	 */
	private String userEmail;
	/**
	 * 登陆账号
	 */
	private String userAccount;
	/**
	 * 性别
	 */
	private String userSex;
	/**
	 * 微信照片
	 */
	private String userWechat;
	/**
	 * 用户类型
	 */
	private String userType;
	/**
	 * 是否封禁
	 */
	private String userIsBanned;
	/**
	 * 头像
	 */
	private String userPortrait;
	/**
	 * 个人签名
	 */
	private String userSynopsis;
	/**
	 * 创建时间
	 */
	private String userCreatetime;
	/**
	 * 修改时间
	 */
	private String userModifytime;
	/**
	 * 是否激活
	 */
	private String userIsActivation;
	/**
	 * code
	 * 
	 */
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + ", userAccount=" + userAccount + ", userSex=" + userSex + ", userWechat=" + userWechat
				+ ", userType=" + userType + ", userIsBanned=" + userIsBanned + ", userPortrait=" + userPortrait
				+ ", userSynopsis=" + userSynopsis + ", userCreatetime=" + userCreatetime + ", userModifytime="
				+ userModifytime + ", userIsActivation=" + userIsActivation + ", code=" + code + "]";
	}

}