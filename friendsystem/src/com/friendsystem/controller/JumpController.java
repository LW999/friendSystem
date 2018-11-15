package com.friendsystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.User;
import com.friendsystem.service.UserService;

@Controller
@SessionAttributes("session")
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

	/**
	 * 跳转到发表文章
	 */
	@RequestMapping("createArticle")

	public ModelAndView createArticle(@ModelAttribute("session") User userSession, Model model, String article_Id) {
		ModelAndView modelAndView = new ModelAndView();
		List<Article> listA = new ArrayList<>();
		listA = userService.getMYArticle(userSession);
		if (article_Id != null && article_Id.trim().length() > 0) {
			System.out.println("进来");
			Article article = userService.getArticleById(article_Id);
			modelAndView.addObject("article", article);
		}
		modelAndView.addObject("listA", listA);
		System.out.println("KDKDKDK:" + listA.size());
		modelAndView.setViewName("user/writeArticle");
		return modelAndView;
	}

	/**
	 * 跳转到推荐
	 * 
	 * @return
	 */
	@RequestMapping("recommend")
	public ModelAndView recommend() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("myAttention/recommendAttention");
		return modelAndView;
	}
}
