package com.friendsystem.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.friendsystem.DTO.Article_DetailsDTO;
import com.friendsystem.DTO.Article_Like_CollectionDTO;
import com.friendsystem.DTO.CommentDTO;
import com.friendsystem.DTO.KeywordDTO;
import com.friendsystem.DTO.LikeDTO;
import com.friendsystem.DTO.UserAttentionDTO;
import com.friendsystem.DTO.UserLikeAndTimeDTO;
import com.friendsystem.DTO.User_AllArticlesAndLikeDTO;
import com.friendsystem.DTO.User_ArticleDTO;
import com.friendsystem.DTO.User_LikeDTO;
import com.friendsystem.pojo.Keyword;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.Recommended;
import com.friendsystem.pojo.User;
import com.friendsystem.service.HomeService;
import com.friendsystem.service.OperationService;
import com.friendsystem.service.UserService;

@Controller
@SessionAttributes("session")
@RequestMapping("homePage")
public class HomePageController {

	@Resource(name = "homeService")
	private HomeService homeService;

	@Resource(name = "userService")
	private UserService userService;

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
	@ResponseBody
	public ModelAndView homePage(@ModelAttribute("session") User userSession, Model map,
			@RequestParam(value = "start", required = false, defaultValue = "0") Integer start) {
		// 使用 ModelAndView mod = new ModelAndView();
		ModelAndView mod = new ModelAndView();
		if (userSession.getUserType().equals("tourists")) {
			// 需要页面显示5个随机推荐的作者
		} else {
		}

		// 需要标签
		List<Project> listProject = homeService.getAllProject();
		// 需要推荐文章
		List<Recommended> listRecommended = homeService.getRecommended();
		// 需要页面随机显示的文章
		// List<Article_Like_CollectionDTO> listRandomArticlesDTO =
		// homeService.getRandomArticles(start);

		// 需要页面显示5个随机推荐的作者 List<User_LikeDTO> listRandomUserDTO
		// =homeService.getRandomUsers(userSession);
		//
		//
		// mod.addObject("listRandomUserDTO", listRandomUserDTO);
		// System.out.println("hahahhahah:" + listRandomArticlesDTO.size());
		//
		mod.addObject("listProject", listProject);
		mod.addObject("listRecommended", listRecommended);

		// mod.addObject("listRandomArticlesDTO", listRandomArticlesDTO);
		mod.setViewName("/home/home");

		return mod;

	}

	/**
	 * 首页往下加载更多文章
	 */
	@RequestMapping("more")
	@ResponseBody
	public List<Article_Like_CollectionDTO> moreArtticle(
			@RequestParam(value = "start", required = false, defaultValue = "0") Integer start) {
		List<Article_Like_CollectionDTO> listRandomArticlesDTO = homeService.getRandomArticles(start);
		return listRandomArticlesDTO;
	}

	/**
	 * 点击更多作者
	 * 
	 * @return
	 */
	@RequestMapping("moreAuthou")
	public void moreAuthou(@ModelAttribute("session") User userSession, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		List<User_ArticleDTO> listMoreAuthou = operationService.getMoreAuthou(userSession);
		if (listMoreAuthou.size() > 0) {
			modelAndView.addObject("listMoreAuthou", listMoreAuthou);
		}
	}

	/**
	 * 点击显示详细文章
	 * 
	 * @return
	 */
	@RequestMapping("articleDetail")
	public ModelAndView articleDetails(String article_Id, @ModelAttribute("session") User userSession, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		String isLike = "";
		if (userSession.getUserType().equals("tourists")) {
			isLike = "already2";
		} else {
			// 查看是否点赞
			isLike = operationService.isLike(article_Id, userSession.getUserId());
		}
		modelAndView.addObject("isLike", isLike);
		// 浏览量加1
		operationService.addView(article_Id);
		Article_DetailsDTO article_DetailsDTO = new Article_DetailsDTO();
		article_DetailsDTO = operationService.getArticleDetail(article_Id);
		// 根据文章找到作者获得的所有阅读量
		int allViews = operationService.getView(article_Id);
		// 根据文章ID找到作者获得的所有
		modelAndView.addObject("article_DetailsDTO", article_DetailsDTO);
		modelAndView.addObject("views", allViews);
		modelAndView.setViewName("articleDetail/articleDetail");
		return modelAndView;
	}

	/**
	 * 换一批作者
	 */
	@RequestMapping("otherUser")
	@ResponseBody
	public List<User_LikeDTO> otherUser(@ModelAttribute("session") User userSession, Model model,
			HttpServletRequest request, HttpServletResponse response, String page) {
		List<User_LikeDTO> listRandomUserDTO = homeService.getRandomUsers(userSession);
		return listRandomUserDTO;
	}

	/**
	 * 喜欢某篇文章
	 * 
	 */
	@RequestMapping("likeArticle")
	@ResponseBody
	public LikeDTO likeArticle(String article_Id, String user_Id) {
		if (article_Id != null && article_Id.length() > 0 && user_Id != null && user_Id.trim().length() > 0) {
			LikeDTO likeDTO = new LikeDTO();
			likeDTO = homeService.getLikes(article_Id, user_Id);
			return likeDTO;
		}
		return null;
	}

	/**
	 * 查看点赞用户
	 */
	@RequestMapping("userLike")
	@ResponseBody
	public List<UserLikeAndTimeDTO> likeTime(String article_Id) {
		List<UserLikeAndTimeDTO> ListUserTime = new ArrayList<>();
		ListUserTime = homeService.getUserLike(article_Id);
		return ListUserTime;
	}

	/**
	 * 查看用户关注的所有人
	 */
	@RequestMapping("userAttention")
	public ModelAndView userAttention(@ModelAttribute("session") User userSession, Model model, String user_Id,
			@RequestParam(value = "start", required = false, defaultValue = "0") Integer start) {
		ModelAndView modelAndView = new ModelAndView();
		if (user_Id != null && user_Id.trim().length() > 0) {
			String isAttention = userService.getIsAttention(userSession, user_Id);
			List<UserAttentionDTO> listU = new ArrayList<>();
			listU = homeService.getUserAttention(user_Id, userSession);
			User_AllArticlesAndLikeDTO UALDTO = userService.getUALDTO(user_Id, start);
			int allAttention = userService.getAttentionNumber(user_Id);
			int fansNumber = userService.getFansNumber(user_Id);
			int articlesNumber = UALDTO.getListA().size();
			int userLikes = userService.getlike(user_Id);
			modelAndView.addObject("isAttention", isAttention);
			modelAndView.addObject("userLikes", userLikes);// 收到的喜欢
			modelAndView.addObject("UALDTO", UALDTO);
			modelAndView.addObject("allAttention", allAttention);
			modelAndView.addObject("fansNumber", fansNumber);
			modelAndView.addObject("articlesNumber", articlesNumber);
			modelAndView.addObject("listU", listU);
		}
		modelAndView.setViewName("user/myAttention");
		return modelAndView;
	}

	/**
	 * 关键字搜索,最多只查5条
	 * 
	 * @return KeywordDTO
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "keyword")
	public ModelAndView keyword(@ModelAttribute("session") User userSession, Model map, HttpServletRequest request,
			HttpServletResponse response, String search) throws UnsupportedEncodingException {
		/*
		 * System.out.println("d:"+search); String dataformat = new
		 * String(search.getBytes("iso8859-1"), "utf8");
		 * System.out.println("ds:"+dataformat);
		 */
		ModelAndView modelAndView = new ModelAndView();
		KeywordDTO keywordDTO = homeService.getSearch(search);
		modelAndView.addObject("search", search);
		modelAndView.addObject("keywordDTO", keywordDTO);
		modelAndView.setViewName("search/serchAll");
		return modelAndView;
	}

	@RequestMapping(value = "keyword2")
	public ModelAndView keyword2(@ModelAttribute("session") User userSession, Model map, HttpServletRequest request,
			HttpServletResponse response, String search) throws UnsupportedEncodingException {
		System.out.println("d:"+search);
		String dataformat = new String(search.getBytes("iso8859-1"), "utf8");
		System.out.println("ds:" + dataformat);
		ModelAndView modelAndView = new ModelAndView();
		KeywordDTO keywordDTO = homeService.getSearch(dataformat);
		modelAndView.addObject("keywordDTO", keywordDTO);
		modelAndView.addObject("search", dataformat);
		modelAndView.setViewName("search/serchAll");
		return modelAndView;
	}

	/**
	 * 显示24H内的最热搜索
	 */
	@RequestMapping("getKeyword")
	@ResponseBody
	public List<Keyword> getKeyword() {
		List<Keyword> listK = new ArrayList<>();
		listK = homeService.getKeyword();
		return listK;
	}

	/**
	 * 搜索换一批
	 */
	@RequestMapping("change")
	@ResponseBody
	public List<Keyword> getChangeKeyword() {
		List<Keyword> listK = homeService.getChange();

		return listK;
	}

	/**
	 * 添加一级评论
	 */
	@RequestMapping("commentOne")
	@ResponseBody
	private CommentDTO commentOne(@ModelAttribute("session") User userSession, Model map, String not_id,
			String content) {
		/**
		 * 添加一级评论
		 */
		System.out.println("hi");
		CommentDTO commentDTO = new CommentDTO();
		commentDTO = homeService.addCommnet(userSession, not_id, content);
		return commentDTO;

	}

	/**
	 * 添加二级评论
	 */
	@RequestMapping("commentTwo")
	@ResponseBody
	private CommentDTO commentTwo(@ModelAttribute("session") User userSession, Model map, String not_id, String content,
			String parent_id, String userTwo_id, Integer floor) {
		/**
		 * 添加二级评论
		 */
		CommentDTO commentDTO = new CommentDTO();
		commentDTO = homeService.addCommnetTwo(userSession, not_id, parent_id, content, userTwo_id, floor);
		return commentDTO;

	}

	/**
	 * 获取评论
	 */
	@RequestMapping("getComment")
	@ResponseBody
	private List<CommentDTO> getComment(String not_id) {
		System.out.println("ID:" + not_id);
		List<CommentDTO> listCommentDTO = new ArrayList<>();
		listCommentDTO = homeService.getComment(not_id);
		return listCommentDTO;

	}
}
