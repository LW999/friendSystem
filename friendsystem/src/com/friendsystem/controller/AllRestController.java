package com.friendsystem.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendsystem.pojo.Project;
import com.friendsystem.service.HomeService;

@RestController
@RequestMapping("rest")
public class AllRestController {

	@Resource(name = "homeService")
	private HomeService homeService;

	@RequestMapping("/pro")
	public Model project(Model model) {

		// 需要标签
		List<Project> listProject = homeService.getAllProject();
		model.addAttribute(listProject);
		return model;
	}

}
