package com.friendsystem.controller;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.pojo.User;
import com.friendsystem.service.LoginService;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import sun.security.util.Password;

/**
 * 
 * @author LW 登陆
 */
@Controller
@SessionAttributes("Session")
@RequestMapping("login")
public class LoginController {
	@Resource(name = "loginService")
	private LoginService loginService;
	private HttpServletResponse response;
	private HttpServletRequest request;
	private String account;
	private String password;
	private String email;

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ModelAndView login() {
		if (account != null && account.trim().length() > 0 && password != null && password.trim().length() > 0) {
			User userSession = loginService.getUserByAccount(account, password);
			if (userSession != null) {
				// 允许登陆

				request.getSession().setAttribute("userSession", userSession);
				ModelAndView modelAndView = new ModelAndView();

				modelAndView.addObject("Session", userSession);// 使用注解
				/**
				 * 在其他controller调用Session
				 * @SessionAttributes("Session") 
				 * public String XXX(@ModelAttribute("Session") User user)
				 */
				modelAndView.addObject("session", userSession);
				return modelAndView;

			}
			if (userSession == null) {
				// 被封禁或者未注册
			}
			return null;
		}
		return null;
	}

}
