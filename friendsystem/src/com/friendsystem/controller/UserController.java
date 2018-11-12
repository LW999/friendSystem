package com.friendsystem.controller;

import java.io.File;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.DTO.ALLUserAttentionDTO;
import com.friendsystem.DTO.AllUserArticleDTO;
import com.friendsystem.DTO.User_AllArticlesAndLikeDTO;
import com.friendsystem.pojo.User;
import com.friendsystem.service.UserService;
import com.friendsystem.util.ImgUtil;
import com.sun.java.swing.plaf.motif.resources.motif;

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
		System.out.println("???dsd?=" + user_Id);
		System.out.println("????=" + userSession);
		response.setContentType("text/html; charset=utf-8");
		System.out.println("ID :" + user_Id);
		if (user_Id != null && user_Id.trim().length() > 0) {
			String message = userService.getMessage(user_Id, userSession);
			System.out.println("检查：" + message);
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
	public ModelAndView whoPeople(@ModelAttribute("session") User userSession, Model map, String user_Id) {
		System.out.println("作者ID:" + user_Id);
		User_AllArticlesAndLikeDTO UALDTO = userService.getUALDTO(user_Id);
		ALLUserAttentionDTO allUserAttentionDTO = userService.getAllUserAttention(userSession);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("UALDTO", UALDTO);
		modelAndView.addObject("allUserAttentionDTO", allUserAttentionDTO);
		modelAndView.setViewName("/myAttention/people");
		System.out.println("DTO:" + UALDTO);
		return modelAndView;
	}

	/**
	 * 更改个人基础资料
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "basic", method = RequestMethod.POST)
	private ModelAndView basicSetting(@ModelAttribute("session") User userSession, Model model, String textName,
			HttpServletRequest request, HttpServletResponse response, MultipartFile pictureFile) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		String imgPath = "";
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
		User userNewSession = userService.updateBasic(textName, imgPath, userSession);
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
			String content, MultipartFile pictureFile, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("");
		String imgPath = ImgUtil.upload(request, pictureFile);
		String message = userService.addArticle(userSession, titleName, content, imgPath);
		return modelAndView;
	}

}
