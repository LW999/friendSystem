package com.friendsystem.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	 * 用户关注
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

}
