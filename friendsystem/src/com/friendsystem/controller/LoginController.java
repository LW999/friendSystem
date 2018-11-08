package com.friendsystem.controller;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
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
@SessionAttributes("session")
@RequestMapping("login")
public class LoginController {
	@Resource(name = "loginService")
	private LoginService loginService;
	private HttpServletResponse response;
	private HttpServletRequest request;

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

	@RequestMapping("/login")
	public ModelAndView login(Model model, String account, String password) {
		System.out.println("账号：" + account + "密码：" + password);
		ModelAndView modelAndView = new ModelAndView();
		String message;
		if (account != null && account.trim().length() > 0 && password != null && password.trim().length() > 0) {
			User userSession = loginService.getUserByAccount(account, password);
			System.err.println("user:" + userSession);
			if (userSession == null) {
				message = "error";
				modelAndView.addObject("message", message);
				modelAndView.setViewName("login");
				return modelAndView;

			}
			if (userSession != null) {
				// 允许登陆
				// request.getSession().setAttribute("userSession", userSession);
				// modelAndView.addObject("Session", userSession);// 使用注解
				model.addAttribute("session", userSession);
				/**
				 * 在其他controller调用Session @SessionAttributes("Session") public String
				 * XXX(@ModelAttribute("Session") User user)
				 */
				modelAndView.setViewName("forward:/homePage/index.do");
				return modelAndView;

			}
		} else {
			message = "error2";
			modelAndView.addObject("message", message);
			modelAndView.setViewName("login");
			return modelAndView;
		}
		return modelAndView;
	}

	/**
	 * 清除Session
	 * 
	 * @param status
	 * @return
	 */
	@RequestMapping("/logout")
	public ModelAndView logout(SessionStatus status) {
		System.out.println("lllll");
		ModelAndView ModelAndView = new ModelAndView();
		ModelAndView.setViewName("forward:/homePage/session.do");
		status.setComplete();
		return ModelAndView;

	}

}
