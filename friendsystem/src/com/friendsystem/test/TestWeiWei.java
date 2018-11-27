package com.friendsystem.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.annotation.Resource;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.friendsystem.DTO.UserAttentionDTO;
import com.friendsystem.DTO.User_AllArticlesAndLikeDTO;
import com.friendsystem.DTO.User_LikeDTO;
import com.friendsystem.pojo.Article;
import com.friendsystem.pojo.Keyword;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.User;
import com.friendsystem.service.HomeService;
import com.friendsystem.service.LoginService;
import com.friendsystem.service.ManagementService;
import com.friendsystem.service.RegisteredService;
import com.friendsystem.service.UserService;
import com.friendsystem.util.BuildUuid;
import com.friendsystem.util.Difference;
import com.friendsystem.util.GenerateAccount;
import com.friendsystem.util.RemoveHTML;
import com.friendsystem.util.TimeUtil;
import com.friendsystem.util.ValidationMail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml",
		"classpath:spring/applicationContext-service.xml" })

public class TestWeiWei {
	public static final String SMTPSERVER = "smtp.qq.com";// 邮箱服务器地址（用QQ还是网易看需求，我这里用的是网易邮箱）
	public static final String SMTPPORT = "465"; // 邮箱服务器默认端口
	public static final String ACCOUT = "835621887@qq.com";// 邮箱帐号
	public static final String PWD = "kohsfsungfmzbeff";// 这是授权码，并不是邮箱的登录密码

	@Resource(name = "loginService")
	private LoginService loginService;

	/**
	 * 登陆方法测试
	 */
	@Test
	public void test2() {
		String account = "789";
		String password = "456";
		User userSession = loginService.getUserByAccount(account, password);
		System.out.println("user:" + userSession);
	}

	@Test
	public void mail() throws Exception {
		// 创建邮件配置
		Properties props = new Properties();
		String code = BuildUuid.getUuid();
		props.setProperty("mail.transport.protocol", "smtp"); // 使用的协议（JavaMail规范要求）
		props.setProperty("mail.smtp.host", SMTPSERVER); // 发件人的邮箱的 SMTP 服务器地址
		props.setProperty("mail.smtp.port", SMTPPORT);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.auth", "true"); // 需要请求认证
		props.setProperty("mail.smtp.ssl.enable", "true");// 开启ssl
		// 根据邮件配置创建会话，注意session别导错包
		Session session = Session.getDefaultInstance(props);
		// 开启debug模式，可以看到更多详细的输入日志
		session.setDebug(true);
		// 创建邮件
		MimeMessage message = createEmail(session, "835621887@qq.com", code);
		// 获取传输通道
		Transport transport = session.getTransport();
		transport.connect(SMTPSERVER, ACCOUT, PWD);
		// 连接，并发送邮件
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();

	}

	public static MimeMessage createEmail(Session session, String mail, String code) throws Exception {
		// 根据会话创建邮件
		MimeMessage msg = new MimeMessage(session);
		// address邮件地址, personal邮件昵称, charset编码方式
		InternetAddress fromAddress = new InternetAddress(ACCOUT, "帅气阿伟有限公司", "utf-8");
		// 设置发送邮件方
		msg.setFrom(fromAddress);
		InternetAddress receiveAddress = new InternetAddress(mail, "邮箱验证", "utf-8");
		// 设置邮件接收方
		msg.setRecipient(RecipientType.TO, receiveAddress);
		// 设置邮件标题
		msg.setSubject("邮箱验证", "utf-8");
		// msg.setContent(m,"text/html;charset=gb2312");

		msg.setText("点击我<a>localhost:8080</a>");
		String content = "<html><head></head><body><h1>这是一封阿伟的激活邮件,激活请点击以下链接</h1><h3><a href='http://localhost:8080/RegisterDemo/ActiveServlet?code="
				+ code + "'>http://localhost:8080/?code=" + code + "</href></h3></body></html>";
		msg.setContent(content, "text/html;charset=UTF-8");
		// 设置显示的发件时间
		msg.setSentDate(new Date());
		// 保存设置
		msg.saveChanges();
		return msg;
	}

	/**
	 * 随机生成账号
	 */
	@Test
	public void testNumber() {
		System.out.println("账号：" + GenerateAccount.nextInt8());

	}

	@Resource(name = "registeredService")
	private RegisteredService registeredService;

	@Test
	public void tette() {
		String code = "89898";
		String isActivation = registeredService.getUserByCode(code);
		System.out.println("???:" + isActivation);
		if (isActivation.equals("Pass")) {
			registeredService.activation(code);
		}

	}

	@Test
	public void h() {
		System.out.println(ValidationMail.checkEmaile("877381442@qq.com"));
		System.out.println(ValidationMail.checkEmaile("@163.com"));
		System.out.println(ValidationMail.checkEmaile("kero99@163.com.cn"));
		System.out.println(ValidationMail.checkEmaile("test.b@qq.com"));
	}

	@Resource(name = "managementService")
	private ManagementService managementService;

	@Test
	public void addpro() {

		Project project = new Project();
		project.setProjectId(BuildUuid.getUuid());
		project.setProjectIsDelete("0");
		project.setProjectCreatetime(TimeUtil.getStringSecond());
		project.setProjectModifytime(TimeUtil.getStringSecond());
		project.setProjectName("旅行");
		project.setProjectImg(
				"‪//upload.jianshu.io/collections/images/13/%E5%95%8A.png?imageMogr2/auto-orient/strip|imageView2/1/w/64/h/64");
		String msg = managementService.addProperties(project);
		System.out.println("okok:" + msg);

	}

	@Resource(name = "homeService")
	private HomeService homeService;

	@Test
	public void suiji() {
		String type = "";
		// List<User_LikeDTO> listRandomUserDTO = homeService.getRandomUsers(type);
		// System.out.println("dto:" + listRandomUserDTO);
	}

	@Resource(name = "userService")
	private UserService userService;

	@Test
	public void du() {
		String user_Id = "29ff25c0-e7e9-4f96-8f83-82747bd398b1";
		User_AllArticlesAndLikeDTO UALDTO = userService.getUALDTO(user_Id);
		System.out.println("ddd" + UALDTO);
	}

	@Test
	public void suijizuozhe() {
		User userSession = new User();
		userSession.setUserType("user");
		userSession.setUserId("a5b7021f-e2f9-4924-b403-40d7583ea339");
		List<User_LikeDTO> listRandomUserDTO = homeService.getRandomUsers(userSession);
		int i = 1;
		for (User_LikeDTO user_LikeDTO : listRandomUserDTO) {
			System.out.println("hahha:" + i + ":" + user_LikeDTO.getUser().getUserId());
			i++;
		}
	}

	@Test
	public void dsdas() {
		String dString = RemoveHTML.Html2Text(
				"<p>使用 base64 保存图片</p><p style=\"text-align: center;\">李伟最帅好吧</p><p>李伟最帅好吧</p><p style=\"text-align: center;\">李伟最帅好吧</p><p style=\"text-align: center;\">李伟最帅好吧</p><p style=\"text-align: center;\">李伟最帅好吧</p><p style=\"text-align: center;\">李伟最帅好吧<img src=\"data:image/png;base64,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\" style=\"color: rgb(51, 51, 51); font-size: 17px; max-width: 100%;\"><img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/40/pcmoren_tian_org.png\" alt=\"[舔屏]\" data-w-e=\"1\" style=\"color: rgb(51, 51, 51); font-size: 17px;\"><img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/50/pcmoren_huaixiao_org.png\" alt=\"[坏笑]\" data-w-e=\"1\" style=\"color: rgb(51, 51, 51); font-size: 17px;\"></p><p><br></p>",
				20);
		System.out.println("ll:" + dString);
	}

	@Test
	public void dsad() {
		List<UserAttentionDTO> listU = new ArrayList<>();
		User userSession = new User();
		userSession.setUserType("user");
		userSession.setUserId("16233b98-0053-4288-98bb-fe11803985bf");
		listU = homeService.getUserAttention("a5b7021f-e2f9-4924-b403-40d7583ea339", userSession);
		for (UserAttentionDTO userAttentionDTO : listU) {
			System.out.println("User:" + userAttentionDTO.getUser().getUserName());
		}
	}

	/**
	 * 计算时间差
	 * 
	 * @throws ParseException
	 */
	@Test
	public void jisuanshijiancha() throws ParseException {
		int oneDay = 86400000;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = TimeUtil.getStringSecond();
		Date d1 = df.parse(today);
		Date d2 = df.parse("2018-11-04 14:53:07");
		long diff = d1.getTime() - d2.getTime();// 这样得到的差值是微秒级别
		System.out.println("diff" + diff);
	}

	@Test
	public void ddsald() throws ParseException {
		String date = "2018-11-23 11:53:07";
		System.out.println(Difference.diff(date));
		if (Difference.diff(date)) {
			System.out.println("hahhah");
		} else {
			System.out.println("jkjkjk");
		}
	}

	@Test
	public void das() {
		List<Keyword> listK = new ArrayList<>();
		listK = homeService.getKeyword();
		System.out.println("DDD:" + listK);
		System.out.println("ddd:" + listK.size());
	}

	@Test
	public void dsahu() {
		homeService.test("保存");

	}

	@Test
	public void hdisah() {
		Random random = new Random();
		List<User> list = homeService.getAllUser();
		/*
		 * list.add("29ff25c0-e7e9-4f96-8f83-82747bd398b1");
		 * list.add("6eb279cf-330b-4ccf-9842-28480ab2a63c");
		 * list.add("a5b7021f-e2f9-4924-b403-40d7583ea339");
		 * list.add("13c1bdad-f434-4739-a62d-b33a3c6c57b4");
		 * list.add("3bbe4ba1-01a8-4f64-af86-bec74ea237fa");
		 * list.add("22f3f544-ca75-4816-922b-2e853c7a4ebc");
		 * list.add("13e0013c-ca22-4aba-bcd7-07ef1cc15b67");
		 * list.add("16233b98-0053-4288-98bb-fe11803985bf");
		 */
		List<Article> lista = homeService.getAll();
		System.out.println("KKK:" + lista.size());
		int i = 1;
		for (Article article : lista) {
			article.setArticleByUser(list.get(random.nextInt(list.size())).getUserId());
			article.setArticleModifytime(TimeUtil.getStringSecond());
			int s = homeService.update(article);
		
			System.out.println("LLL:" + s + i);
			i= i+s;
		}

	}
}
