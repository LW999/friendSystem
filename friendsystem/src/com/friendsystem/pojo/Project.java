package com.friendsystem.pojo;

/**
 * 
 * @author 哈哈哈哈哈哈 专题表
 */
public class Project {
	/**
	 * 专题ID
	 */
	private String projectId;
	/**
	 * 专题名称
	 */
	private String projectName;
	/**
	 * 专题是否删除
	 */
	private String projectIsDelete;
	/**
	 * 创建时间
	 */
	private String projectCreatetime;
	/**
	 * 修改时间
	 */
	private String projectModifytime;
	/**
	 * 专题图片
	 */
	private String projectImg;

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId == null ? null : projectId.trim();
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName == null ? null : projectName.trim();
	}

	public String getProjectIsDelete() {
		return projectIsDelete;
	}

	public void setProjectIsDelete(String projectIsDelete) {
		this.projectIsDelete = projectIsDelete == null ? null : projectIsDelete.trim();
	}

	public String getProjectCreatetime() {
		return projectCreatetime;
	}

	public void setProjectCreatetime(String projectCreatetime) {
		this.projectCreatetime = projectCreatetime == null ? null : projectCreatetime.trim();
	}

	public String getProjectModifytime() {
		return projectModifytime;
	}

	public void setProjectModifytime(String projectModifytime) {
		this.projectModifytime = projectModifytime == null ? null : projectModifytime.trim();
	}

	public String getProjectImg() {
		return projectImg;
	}

	public void setProjectImg(String projectImg) {
		this.projectImg = projectImg == null ? null : projectImg.trim();
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectIsDelete="
				+ projectIsDelete + ", projectCreatetime=" + projectCreatetime + ", projectModifytime="
				+ projectModifytime + ", projectImg=" + projectImg + "]";
	}

}