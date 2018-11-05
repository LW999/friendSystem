package com.friendsystem.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
