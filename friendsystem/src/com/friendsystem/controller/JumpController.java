package com.friendsystem.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.pojo.User;
import com.friendsystem.service.UserService;

@Controller
@RequestMapping("jump")
public class JumpController {
	@Resource(name = "userService")
	private UserService userService;

	/**
	 * 跳转到登陆
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("login");
		ModelAndView modelAndView = new ModelAndView();
		String check = "Login";
		modelAndView.setViewName("login");
		modelAndView.addObject("check", check);
		return modelAndView;
	}

	/**
	 * 跳转到注册
	 */
	@RequestMapping("/reg")
	public ModelAndView reg() {
		ModelAndView modelAndView = new ModelAndView();
		String check = "reg";
		modelAndView.setViewName("register");
		modelAndView.addObject("check", check);
		return modelAndView;

	}

	/**
	 * 跳转到个人基础设置
	 */
	@RequestMapping("setting")
	public ModelAndView basicSetting() {
		ModelAndView modelAndView = new ModelAndView();
		// String message = "我真猛";
		// modelAndView.addObject("message", message);
		modelAndView.setViewName("/userSetting/basic");
		return modelAndView;
	}
	/**
	 * 跳转到个人设置
	 */
	@RequestMapping("personal")
	public ModelAndView personalSetting() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/userSetting/personal");
		return modelAndView;
	}

}
