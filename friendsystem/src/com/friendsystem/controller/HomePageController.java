package com.friendsystem.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.mail.Session;
import javax.validation.constraints.Null;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.DTO.Article_DetailsDTO;
import com.friendsystem.DTO.Article_Like_CollectionDTO;
import com.friendsystem.DTO.User_ArticleDTO;
import com.friendsystem.DTO.User_LikeDTO;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.Recommended;
import com.friendsystem.pojo.User;
import com.friendsystem.service.HomeService;
import com.friendsystem.service.OperationService;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

@Controller
@SessionAttributes("session")
@RequestMapping("homePage")
public class HomePageController {

	@Resource(name = "homeService")
	private HomeService homeService;

	@Resource(name = "operationService")
	private OperationService operationService;

	/**
	 * 登陆进来前先制空Session
	 */
	@RequestMapping("/session")
	public ModelAndView Session(Model model) {
		ModelAndView modelAndView = new ModelAndView();
		User userSession = new User();
		userSession.setUserType("tourists");// 设置用户属性为游客
		model.addAttribute("session", userSession);
		modelAndView.setViewName("forward:/homePage/index.do");
		return modelAndView;

	}

	/**
	 * 首页显示
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView homePage(@ModelAttribute("session") User userSession,Model map) {
		// 使用 ModelAndView mod = new ModelAndView();
		ModelAndView mod = new ModelAndView();
		if (userSession.getUserType().equals("tourists")) {
			// 需要页面显示5个随机推荐的作者
			System.out.println("没有Session");
		} else {
			System.out.println("Session" + userSession.getUserId());
		}

		// 需要标签
		List<Project> listProject = homeService.getAllProject();
		// 需要推荐文章
		List<Recommended> listRecommended = homeService.getRecommended();
		// 需要页面随机显示的文章
		List<Article_Like_CollectionDTO> listRandomArticlesDTO = homeService.getRandomArticles();
		// 需要页面显示5个随机推荐的作者
		List<User_LikeDTO> listRandomUserDTO = homeService.getRandomUsers(userSession);
		// 需要页面显示5个随机推荐的作者
		mod.addObject("listRandomUserDTO", listRandomUserDTO);
		mod.addObject("listProject", listProject);
		mod.addObject("listRecommended", listRecommended);
		mod.addObject("listRandomArticlesDTO", listRandomArticlesDTO);
		mod.setViewName("/home/project");
		mod.setViewName("/home/home");
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
	/**
	 * 点击显示详细文章
	 * 
	 * @return
	 */
	@RequestMapping("articleDetail")
	public ModelAndView articleDetails(String article_Id) {
		ModelAndView modelAndView = new ModelAndView();
		Article_DetailsDTO article_DetailsDTO = new Article_DetailsDTO();
		article_DetailsDTO = operationService.getArticleDetail(article_Id);
		return modelAndView;
	}
	
}
