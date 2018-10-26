package com.friendsystem.login.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.ArticleExample.Criteria;
import com.friendsystem.pojo.User;
import com.friendsystem.pojo.UserExample;

@Service("testService")
public class TestService {
	@Resource
	private UserMapper userMapper;

	public List<User> getAll() {
		UserExample UE = new UserExample();
		com.friendsystem.pojo.UserExample.Criteria criteria = UE.createCriteria();
		criteria.andUserIdEqualTo("89");
		List<User> LU = userMapper.selectByExample(UE);
		return LU;
	}

}
