package com.friendsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("jump")
public class JumpController {
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

}
