package com.friendsystem.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.controller.DTO.Article_Like_CollectionDTO;
import com.friendsystem.controller.DTO.User_LikeDTO;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.Recommended;
import com.friendsystem.service.HomeService;

@Controller
@RequestMapping("home")
public class HomePageController {
	@Resource(name = "homeService")
	private HomeService homeService;

	public ModelAndView name() {
		// 需要标签
		List<Project> listProject = homeService.getAllProject();
		// 需要推荐文章
		List<Recommended> listRecommended = homeService.getRecommended();
		// 需要页面随机显示的文章
		List<Article_Like_CollectionDTO> listRandomArticlesDTO = homeService.getRandomArticles();
		// 需要页面显示5个随机推荐的作者
		List<User_LikeDTO> listRandomUserDTO = homeService.getRandomUsers();
		return null;

	}

}
