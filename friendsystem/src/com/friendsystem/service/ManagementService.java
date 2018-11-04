package com.friendsystem.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.friendsystem.mapper.ProjectMapper;
import com.friendsystem.pojo.Project;

/**
 * 管理页面
 * 
 * @author LW
 *
 */
@Service("managementService")
public class ManagementService {
	@Resource
	private ProjectMapper projectMapper;

	public String addProperties(Project project) {
		if (project != null) {
			projectMapper.insert(project);
			return "yes";
		}
		return "no";
	}

}
