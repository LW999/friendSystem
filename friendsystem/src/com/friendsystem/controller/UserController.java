package com.friendsystem.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
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
@SessionAttributes("session")
@RequestMapping("user")
public class UserController {
	@Resource(name = "userService")
	private UserService userService;

	/**
	 * 用户点击关注作者
	 * 
	 * @throws IOException
	 */
	@RequestMapping("attentionUser")
	public void attentionUser(@ModelAttribute("session") User userSession, Model model, String user_Id,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("???dsd?=" + user_Id);
		System.out.println("????=" + userSession);
		response.setContentType("text/html; charset=utf-8");
		System.out.println("ID :" + user_Id);
		if (user_Id != null && user_Id.trim().length() > 0) {
			String message = userService.getMessage(user_Id, userSession);
			System.out.println("检查：" + message);
			response.getWriter().println(message);
		}

	}

	/**
	 * 用户点击我的关注
	 * 
	 * @param userSession
	 * @return modelAndView
	 */
	@RequestMapping("myAttention")
	public ModelAndView allAttention(@ModelAttribute("session") User userSession, Model map) {
		// 获得所有关注的东西
		ALLUserAttentionDTO allUserAttentionDTO = userService.getAllUserAttention(userSession);
		// 获得所有关注的人发布的最新文章
		List<AllUserArticleDTO> listAllUserArticleDTO = userService.getAllUserArticle(userSession);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("allUserAttentionDTO", allUserAttentionDTO);
		modelAndView.addObject("listAllUserArticleDTO", listAllUserArticleDTO);
		modelAndView.setViewName("/myAttention/allAttention");
		return modelAndView;

	}

}
