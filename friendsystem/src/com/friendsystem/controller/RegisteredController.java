package com.friendsystem.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.service.RegisteredService;

@Controller
@RequestMapping("register")
public class RegisteredController {

	/**
	 * 注册
	 * 
	 * @return
	 */
	@Resource(name = "registeredService")
	private RegisteredService registeredService;

	@RequestMapping("/reg")
	public ModelAndView Registered(String name, String password, String mail) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if (mail != null && mail.trim().length() > 0 && password != null && password.trim().length() > 0 && name != null
				&& name.trim().length() > 0) {
			String check = registeredService.getUserByMail(mail);
			if (check.trim().equals("pass")) {
				// 可以使用该邮箱
				String number = registeredService.saveUserAndSedMail(mail, password, name);
				modelAndView.addObject("check", check);
			}
			if (check.equals("NoActivation")) {
				// 已经注册但是未激活
				modelAndView.addObject("check", check);

			}
			if (check.equals("HasBeenRegistered")) {
				modelAndView.addObject("check", check);
				// 该邮箱已经被注册
			}
			if (check.equals("InvalidFormat")) {


			}
			modelAndView.addObject("check", check);
			modelAndView.setViewName("register");

		}
		return modelAndView;

	}

	/**
	 * 激活
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/activation")
	public ModelAndView Activation(String code) {
		ModelAndView modelAndView = new ModelAndView();
		if (code != null && code.trim().length() > 0) {
			// 先查询code是否被激活
			String isActivation = registeredService.getUserByCode(code);
			if (isActivation.equals("Pass")) {
				String message = "ok";
				registeredService.activation(code);
				modelAndView.addObject("message", message);
				modelAndView.setViewName("forward:/homePage/session.do");
			}

		}
		return null;

	}

}
