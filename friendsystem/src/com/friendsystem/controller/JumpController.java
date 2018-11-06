package com.friendsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
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

	/**
	 * 跳转到底部
	 */
	@RequestMapping("/bottom")
	public ModelAndView bottom() {
		System.out.println("底部");
		ModelAndView modelAndView = new ModelAndView();
		String check = "李真猛！";
		modelAndView.setViewName("/home/bottom");
		modelAndView.addObject("check", check);
		return modelAndView;

	}

	/**
	 * 跳转到详情（暂时）
	 * 
	 * @return
	 */
	@RequestMapping("/test")
	public ModelAndView llal() {
		System.out.println("底部");
		ModelAndView modelAndView = new ModelAndView();
		String check = "李真猛！";
		modelAndView.setViewName("/articleDetail/articleDetail");
		modelAndView.addObject("check", check);
		return modelAndView;

	}

	/**
	 * 跳转到我的关注
	 * 
	 * @return
	 */
	@RequestMapping("/attention")
	public ModelAndView attention() {
		System.out.println("底部");
		ModelAndView modelAndView = new ModelAndView();
		String check = "李真猛！";
		modelAndView.setViewName("/myAttention/allAttention");
		modelAndView.addObject("check", check);
		return modelAndView;

	}

	/**
	 * 跳转推荐关注
	 * 
	 * @return
	 */
	@RequestMapping("/recommend")
	public ModelAndView recommendAttention() {
		System.out.println("底部");
		ModelAndView modelAndView = new ModelAndView();
		String check = "李真猛！";
		modelAndView.setViewName("/myAttention/recommendAttention");
		modelAndView.addObject("check", check);
		return modelAndView;

	}
	/**
	 * 跳转到关注的人
	 * 
	 * @return
	 */
	@RequestMapping("/people")
	public ModelAndView people() {
		System.out.println("底部");
		ModelAndView modelAndView = new ModelAndView();
		String check = "李真猛！";
		modelAndView.setViewName("/myAttention/people");
		modelAndView.addObject("check", check);
		return modelAndView;

	}
}
