package com.friendsystem.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.controller.DTO.Article_Like_CollectionDTO;
import com.friendsystem.controller.DTO.User_ArticleDTO;
import com.friendsystem.controller.DTO.User_LikeDTO;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.Recommended;
import com.friendsystem.service.HomeService;
import com.friendsystem.service.OperationService;

@Controller
@RequestMapping("homePage")
public class HomePageController {
	@Resource(name = "homeService")
	private HomeService homeService;

	@Resource(name = "operationService")
	private OperationService operationService;

	/**
	 * 首页显示
	 * 
	 * @return
	 */
	@RequestMapping("index")
	public ModelAndView homePage() {
		// 需要标签
		List<Project> listProject = homeService.getAllProject();
		// 需要推荐文章
		List<Recommended> listRecommended = homeService.getRecommended();
		// 需要页面随机显示的文章
		List<Article_Like_CollectionDTO> listRandomArticlesDTO = homeService.getRandomArticles();
		// 需要页面显示5个随机推荐的作者
		List<User_LikeDTO> listRandomUserDTO = homeService.getRandomUsers();
		// 使用 ModelAndView mod = new ModelAndView();
		ModelAndView mod = new ModelAndView();
		mod.addObject("listProject", listProject);
		mod.addObject("listRecommended", listRecommended);
		mod.addObject("listRandomArticlesDTO", listRandomArticlesDTO);
		mod.addObject("listRandomUserDTO", listRandomUserDTO);
		mod.setViewName("home");
		return mod;

	}

	/**
	 * 点击更多作者
	 * 
	 * @return
	 */
	@RequestMapping("moreAuthou")
	public ModelAndView moreAuthou() {
		ModelAndView modelAndView = new ModelAndView();
		List<User_ArticleDTO> listMoreAuthou = operationService.getMoreAuthou();
		if (listMoreAuthou.size() > 0) {
			modelAndView.addObject("listMoreAuthou", listMoreAuthou);
		}
		return modelAndView;

	}

}
