package com.friendsystem.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.friendsystem.pojo.User;
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
	public String Registered(String name, String password, String mail) throws Exception {
		System.out.println("opopopo");
		System.out.println("kkk:" + mail + password + name);
		if (mail != null && mail.trim().length() > 0 && password != null && password.trim().length() > 0 && name != null
				&& name.trim().length() > 0) {
			String check = registeredService.getUserByMail(mail);
			if (check.equals("Pass")) {
				// 可以使用该邮箱
				String number = registeredService.saveUserAndSedMail(mail, password, name);
				System.out.println("成功！" + number);
			}
			if (check.equals("NoActivation")) {
				// 已经注册但是未激活
				System.out.println("失败！" + check);

			}
			if (check.equals("HasBeenRegistered")) {
				System.out.println("失败！" + check);
				// 该邮箱已经被注册
			}

		}
		return "失败";

	}

	/**
	 * 激活
	 * 
	 * @param code
	 * @return
	 */
	@RequestMapping("/activation")
	public String Activation(String code) {
		System.out.println("okoko:" + code);
		if (code != null && code.trim().length() > 0) {
			// 先查询code是否被激活
			String isActivation = registeredService.getUserByCode(code);
			if (isActivation.equals("Pass")) {
				registeredService.activation(code);
			}

		}
		return null;

	}

}
