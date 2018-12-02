package com.friendsystem.controller;


import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.DTO.ALLUserAttentionDTO;
import com.friendsystem.DTO.AllUserArticleDTO;
import com.friendsystem.DTO.User_AllArticlesAndLikeDTO;
import com.friendsystem.pojo.User;
import com.friendsystem.service.UserService;
import com.friendsystem.util.ImgUtil;

/**
 * 用户的一些操作
 * 
 * @author LW
 *
 */
@Controller
@SessionAttributes("session")
@RequestMapping("user")
public class UserController {
	@Resource(name = "userService")
	private UserService userService;

	/**
	 * 用户点击关注作者
	 * 
	 * @throws IOException
	 */
	@RequestMapping("attentionUser")
	public void attentionUser(@ModelAttribute("session") User userSession, Model model, String user_Id,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=utf-8");

		if (user_Id != null && user_Id.trim().length() > 0) {
			String message = userService.getMessage(user_Id, userSession);
			response.getWriter().println(message);
		}

	}

	/**
	 * 用户点击我的关注
	 * 
	 * @param userSession
	 * @return modelAndView
	 */
	@RequestMapping("myAttention")
	public ModelAndView allAttention(@ModelAttribute("session") User userSession, Model map) {
		ModelAndView modelAndView = new ModelAndView();
		if (userSession.getUserId() == null) {
			String message = "noSession";
			modelAndView.addObject("message", message);
			modelAndView.setViewName("forward:/homePage/session.do");
		}
		// 获得所有关注的东西
		ALLUserAttentionDTO allUserAttentionDTO = userService.getAllUserAttention(userSession);
		// 获得所有关注的人发布的最新文章
		List<AllUserArticleDTO> listAllUserArticleDTO = userService.getAllUserArticle(userSession);

		modelAndView.addObject("allUserAttentionDTO", allUserAttentionDTO);
		modelAndView.addObject("listAllUserArticleDTO", listAllUserArticleDTO);
		modelAndView.setViewName("/myAttention/allAttention");
		return modelAndView;

	}

	/**
	 * 点击关注的作者显示主页
	 * 
	 * @param userSession
	 * @param map
	 * @return
	 */

	@RequestMapping("whoPeople")
	public ModelAndView whoPeople(@ModelAttribute("session") User userSession, Model map, String user_Id,
			@RequestParam(value = "start", required = false, defaultValue = "0") Integer start) {
		User_AllArticlesAndLikeDTO UALDTO = userService.getUALDTO(user_Id, start);
		ALLUserAttentionDTO allUserAttentionDTO = userService.getAllUserAttention(userSession);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("UALDTO", UALDTO);
		modelAndView.addObject("allUserAttentionDTO", allUserAttentionDTO);
		modelAndView.setViewName("/myAttention/people");
		return modelAndView;
	}

	/**
	 * 我的个人主页
	 */
	@RequestMapping("myHome")
	public ModelAndView myHome(@ModelAttribute("session") User userSession, String user_Id,
			@RequestParam(value = "start", required = false, defaultValue = "0") Integer start) {
		String isAttention = userService.getIsAttention(userSession, user_Id);
		User_AllArticlesAndLikeDTO UALDTO = userService.getUALDTO(user_Id, start);
		int allAttention = userService.getAttentionNumber(user_Id);
		int fansNumber = userService.getFansNumber(user_Id);
		int articlesNumber = userService.getSrticlesNumber(user_Id);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("isAttention", isAttention);
		modelAndView.addObject("UALDTO", UALDTO);
		modelAndView.addObject("allAttention", allAttention);
		modelAndView.addObject("fansNumber", fansNumber);
		modelAndView.addObject("articlesNumber", articlesNumber);
		modelAndView.setViewName("user/myHome");
		return modelAndView;
	}

	/**
	 * 我的个人主页
	 */
	@RequestMapping("myselfHome")
	public ModelAndView myselfHome(@ModelAttribute("session") User userSession, Model model,
			@RequestParam(value = "start", required = false, defaultValue = "0") Integer start) {
		System.out.println("kkkk:" + start);
		User_AllArticlesAndLikeDTO UALDTO = userService.getUALDTO(userSession.getUserId(), start);
		int allAttention = userService.getAttentionNumber(userSession.getUserId());
		int fansNumber = userService.getFansNumber(userSession.getUserId());
		int articlesNumber = userService.getSrticlesNumber(userSession.getUserId());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("UALDTO", UALDTO);
		modelAndView.addObject("allAttention", allAttention);
		modelAndView.addObject("fansNumber", fansNumber);
		modelAndView.addObject("articlesNumber", articlesNumber);
		modelAndView.setViewName("user/myHome");
		return modelAndView;
	}

	/**
	 * 更改个人基础资料
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "basic", method = RequestMethod.POST)
	private ModelAndView basicSetting(@ModelAttribute("session") User userSession, Model model, String textName,
			HttpServletRequest request, HttpServletResponse response, MultipartFile pictureFile, MultipartFile weCate,
			String your, String sex) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		String imgPath = "";
		String imgPath2 = "";
		String message = "";
		if (textName.isEmpty() && pictureFile.isEmpty()) {
			message = "noAmend";
			modelAndView.addObject("message", message);
			modelAndView.setViewName("/userSetting/basic");
		}
		if (pictureFile.isEmpty()) {
		} else {
			imgPath = ImgUtil.upload(request, pictureFile);
		}
		if (weCate.isEmpty()) {
		} else {
			imgPath2 = ImgUtil.upload(request, weCate);
		}
		User userNewSession = userService.updateBasic(textName, imgPath, userSession, imgPath2, sex, your);
		model.addAttribute("session", userNewSession);
		message = "ok";
		modelAndView.addObject("message", message);
		modelAndView.setViewName("/userSetting/basic");
		return modelAndView;

	}

	/**
	 * 个人资料修改
	 * 
	 * @throws IOException
	 */
	@RequestMapping("personal")
	public void personalData(@ModelAttribute("session") User userSession, Model model, String user_Id,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		String message = "";

		response.getWriter().println(message);
	}

	/**
	 * 用户保存文章并且显示未发布的文章
	 * 
	 * @throws IOException
	 */
	@RequestMapping("createArticle")
	public ModelAndView createArticle(@ModelAttribute("session") User userSession, Model model, String titleName,
			String content, MultipartFile pictureFile, HttpServletRequest request, HttpServletResponse response,
			String article_Id) throws IOException {
		String message = "";
		String imgPath = ImgUtil.upload(request, pictureFile);
		if (article_Id != null && article_Id.trim().length() > 0) {
			message = userService.updateArticle(article_Id, titleName, content, imgPath);
		} else {

			message = userService.addArticle(userSession, titleName, content, imgPath);
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/jump/createArticle.do");
		return modelAndView;
	}

	/**
	 * 用户发布文章
	 * 
	 * @throws IOException
	 */
	@RequestMapping("release")
	public ModelAndView releaseArticle(@ModelAttribute("session") User userSession, Model model, String titleName,
			String content, MultipartFile pictureFile, HttpServletRequest request, HttpServletResponse response,
			String article_Id) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		// 保存照片
		String imgPath = ImgUtil.upload(request, pictureFile);
		// 在保存的基础上发布
		String message;
		if (article_Id != null && article_Id.trim().length() > 0) {
			message = userService.releaseArticle(article_Id, titleName, content, imgPath);
		}
		// 直接发布
		else {
			message = userService.directlyReleaseArticle(userSession, titleName, content, imgPath);
		}
		modelAndView.addObject("message", message);
		modelAndView.addObject("user_Id", userSession.getUserId());
		modelAndView.setViewName("redirect:/user/myselfHome.do");
		return modelAndView;
	}

	/**
	 * 用户删除文章
	 * 
	 * @throws IOException
	 */
	@RequestMapping("del")
	public void delArticle(HttpServletRequest request, HttpServletResponse response, String article_Id)
			throws IOException {
		if (article_Id != null && article_Id.trim().length() > 0) {
			response.setContentType("text/html; charset=utf-8");
			String message = userService.delArticle(article_Id);
			response.getWriter().println(message);
		}
	}
}
