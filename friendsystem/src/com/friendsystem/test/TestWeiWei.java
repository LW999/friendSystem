package com.friendsystem.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.friendsystem.login.service.TestService;
import com.friendsystem.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml",
		"classpath:spring/applicationContext-service.xml" })

public class TestWeiWei {
	@Resource(name = "testService")
	private TestService testService;

	@Test
	public void test1() {
		List<User> listU = testService.getAll();
		System.out.println("kkkk:" + listU);
	}

}
