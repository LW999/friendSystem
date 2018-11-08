package com.friendsystem.DTO;

import java.util.List;

import com.friendsystem.pojo.AttentionPeople;
import com.friendsystem.pojo.AttentionProject;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.User;

/**
 * 该用户的所有关注
 * 
 * @author LW
 *
 */
public class ALLUserAttentionDTO {
	/**
	 * 用户关注的所有人
	 */
	private List<User> listPeople;
	/**
	 * 
	 * 用户关注的所有专题
	 */
	private List<Project> listProject;

	public List<User> getListPeople() {
		return listPeople;
	}

	public void setListPeople(List<User> listPeople) {
		this.listPeople = listPeople;
	}

	public List<Project> getListProject() {
		return listProject;
	}

	public void setListProject(List<Project> listProject) {
		this.listProject = listProject;
	}

	@Override
	public String toString() {
		return "ALLUserAttentionDTO [listPeople=" + listPeople + ", listProject=" + listProject + "]";
	}



}
