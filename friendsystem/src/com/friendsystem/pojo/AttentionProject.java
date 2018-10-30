package com.friendsystem.pojo;

/**
 * 关注专题表
 * 
 * @author LW
 *
 */
public class AttentionProject {
	/**
	 * ID
	 */
	private String attentionProjectId;
	/**
	 * 关注 的专题ID
	 */
	private String attentionProjectProject;
	/**
	 * 关注人ID
	 */
	private String attentionProjectUser;
	/**
	 * 创建时间
	 */
	private String attentionProjectCreatetime;
	/**
	 * 修改时间
	 */
	private String attentionProjectModifytime;

	public String getAttentionProjectId() {
		return attentionProjectId;
	}

	public void setAttentionProjectId(String attentionProjectId) {
		this.attentionProjectId = attentionProjectId == null ? null : attentionProjectId.trim();
	}

	public String getAttentionProjectProject() {
		return attentionProjectProject;
	}

	public void setAttentionProjectProject(String attentionProjectProject) {
		this.attentionProjectProject = attentionProjectProject == null ? null : attentionProjectProject.trim();
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