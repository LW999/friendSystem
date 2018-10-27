package com.friendsystem.pojo;

public class Project {
    private String projectId;

    private String projectName;

    private String projectIsDelete;

    private String projectCreatetime;

    private String projectModifytime;

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
}