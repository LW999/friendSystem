package com.friendsystem.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.DTO.ALLUserAttentionDTO;
import com.friendsystem.DTO.AllUserArticleDTO;
import com.friendsystem.pojo.User;
import com.friendsystem.service.UserService;

/**
 * 用户的一些操作
 * 
 * @author LW
 *
 */
@Controller
@RequestMapping("user")
public class UserController {
	@Resource(name = "userService")
	private UserService userService;

	/**
	 * 用户点击关注
	 * 
	 * @throws IOException
	 */
	@RequestMapping("attentionUser")
	public void attentionUser(String userId, @ModelAttribute("Session") User userSession, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=utf-8");
		System.out.println("ID :" + userId);
		if (userId != null && userId.trim().length() > 0) {
			String message = userService.getMessage(userId, userSession);
			System.out.println("检查：" + message);
		}

	}

	/**
	 * 用户点击我的关注
	 * 
	 * @param userSession
	 * @return modelAndView
	 */
	@RequestMapping("")
	public ModelAndView allAttention(@ModelAttribute("Session") User userSession) {
		// 获得所有关注的东西
		ALLUserAttentionDTO allUserAttentionDTO = userService.getAllUserAttention(userSession);
		// 获得所有关注的人发布的最新文章
		List<AllUserArticleDTO> allUserArticleDTO = userService.getAllUserArticle(userSession);
		ModelAndView modelAndView = new ModelAndView();

		return null;

	}

}
