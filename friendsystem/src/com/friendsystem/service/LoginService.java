package com.friendsystem.service;

import java.util.Date;
import java.util.Properties;

import javax.annotation.Resource;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.stereotype.Service;

import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.User;
import com.friendsystem.util.BuildUuid;
import com.friendsystem.util.TimeUtil;

@Service("loginService")
public class LoginService {
	@Resource
	private UserMapper userMapper;

	public User getUserByAccount(String account, String password) {
		if (account != null && account.trim().length() > 0 && password != null && password.trim().length() > 0) {
			User user = userMapper.selectUserByAccount(account);
			if (user != null && user.getUserIsActivation().equals("1")) {
				if (user.getUserPassword().equals(password)) {
					if (user.getUserIsBanned().equals("0")) {
						return null;
					}
					System.out.println("ooo:" + user);
					return user;
				}
			}

		}

		return null;
	}

}
