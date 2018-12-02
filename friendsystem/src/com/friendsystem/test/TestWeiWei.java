package com.friendsystem.test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.omg.CORBA.portable.InputStream;
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
import com.friendsystem.util.JiebaSegmenterUtil;
import com.friendsystem.util.RemoveHTML;
import com.friendsystem.util.TimeUtil;
import com.friendsystem.util.ValidationMail;
import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;
import com.huaban.analysis.jieba.SegToken;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

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

	@Test
	public void t() {
		System.out.println("dddDd".toLowerCase());
	}
	
	
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
		User_AllArticlesAndLikeDTO UALDTO = userService.getUALDTO(user_Id, 0);
		System.out.println("ddd" + UALDTO.getListA().size());
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
		String dString = RemoveHTML.Html2Text("<p>使用 base64 保存图片</p><p style=\"text-align: center;\">\r\n" + 
				"							<img src=\"http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/40/pcmoren_tian_org.png\" alt=\"[舔屏]\" data-w-e=\"1\">\r\n" + 
				"						</p><p style=\"text-align: center;\">dasdas</p><p style=\"text-align: center;\">daasdas</p><p style=\"text-align: center;\">dasdsa</p><p style=\"text-align: center;\">阿瑟东撒的</p><p style=\"text-align: center;\">dasdas大萨达</p><table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n" + 
				"							<tbody>\r\n" + 
				"								<tr>\r\n" + 
				"									<th>&nbsp;</th>\r\n" + 
				"									<th>&nbsp;</th>\r\n" + 
				"									<th>&nbsp;</th>\r\n" + 
				"									<th>&nbsp;</th>\r\n" + 
				"									<th>&nbsp;</th>\r\n" + 
				"								</tr>\r\n" + 
				"								<tr>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"								</tr>\r\n" + 
				"								<tr>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"								</tr>\r\n" + 
				"								<tr>\r\n" + 
				"									<td>&nbsp; 大神阿三</td>\r\n" + 
				"									<td>&nbsp;大神d<img src=\"data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAASABIAAD/4QBYRXhpZgAATU0AKgAAAAgAAgESAAMAAAABAAEAAIdpAAQAAAABAAAAJgAAAAAAA6ABAAMAAAABAAEAAKACAAQAAAABAAAB4KADAAQAAAABAAAB4AAAAAD/7QA4UGhvdG9zaG9wIDMuMAA4QklNBAQAAAAAAAA4QklNBCUAAAAAABDUHYzZjwCyBOmACZjs+EJ+/8AAEQgB4AHgAwEiAAIRAQMRAf/EAB8AAAEFAQEBAQEBAAAAAAAAAAABAgMEBQYHCAkKC//EALUQAAIBAwMCBAMFBQQEAAABfQECAwAEEQUSITFBBhNRYQcicRQygZGhCCNCscEVUtHwJDNicoIJChYXGBkaJSYnKCkqNDU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6g4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2drh4uPk5ebn6Onq8fLz9PX29/j5+v/EAB8BAAMBAQEBAQEBAQEAAAAAAAABAgMEBQYHCAkKC//EALURAAIBAgQEAwQHBQQEAAECdwABAgMRBAUhMQYSQVEHYXETIjKBCBRCkaGxwQkjM1LwFWJy0QoWJDThJfEXGBkaJicoKSo1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoKDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uLj5OXm5+jp6vLz9PX29/j5+v/bAEMAAgICAgICAwICAwQDAwMEBQQEBAQFBwUFBQUFBwgHBwcHBwcICAgICAgICAoKCgoKCgsLCwsLDQ0NDQ0NDQ0NDf/bAEMBAgICAwMDBgMDBg0JBwkNDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDf/dAAQAHv/aAAwDAQACEQMRAD8A/fyiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKAP/0P38ooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigD/9H9/KKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooA//S/fyiiigAooooAKKKKACiiigAooooAKTIobGOajJAGTwKBkhYDkkCkDKwyCCPUGq1xJHHGTI4QZ6529Oev0GT7V8w+LP2tPhPoGuT+EtAnvfG3iKDKyaV4WtZNSnjYclZHiPlxYAJPmOvAPfghnzO9rH1RuUYGRz0560uRXxFf/H79oG+U3Wj/Cqw0G2KZjfxR4jt7aVh2PkWiXDKfZiDXJyftE/tI6Zbvdal4K8EX8anLJYeIriKTbn+9LaBM/UgUmzdU5PZH6EFlHJIFG5QQCRk9K+EdB/bLTyt/jv4d+JNEhQ/Ne6YbbXbSMDqzPp8jyqvb5o8+uOo+lfhn8Y/hn8WLJtQ+HviGw1lEO2WO3k2zwsOqy27fvIiO+4ChMUoNbnrVFRLMjdCMZI6+lPDqehBz70zNMdRRkUUDCiiigAooooAKKKKACiiigAooooAKKKKACiikyBzQAtGRTC6lcqQc8jB603coPzECgV9bEuRSbh6iuP8T+N/BvhG387xVrem6TEQCGv7mKAEZ7eYy55rwvUP2x/2YdKmeC6+IujSPEcMtrK9yAScf8sRIvWgvkk9j6lyKTIr5JH7b37LpGR48skOcBpLe4VfzaJR+td74b/aV+AniyRY9B+IHh66mPSH+0Io5f8Avh3BoDla3Pecj1oyKo2l/Z39stzZzRzxOMrJGwdGHswJBq1kYyTxQS2r2JMjpmlqMAbs1JTY3boFFFFIQUUUUAFFFFABRRRQAUUUUAFFFFABRRRQB//T/fyiiigAooooAKKKKACiiigAoyKQ9KiZggyTjkDn1JwPzoAe7AITkcevSvN/if8AE7wV8KfCl14t8c362VhbbVUAhpriVmASCCPO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wQkY6j3FMWK4qjVpShGmlc+xfhd+0x8GPiR4Q0bxXYeLdGtW1K1hnayuL+CK6tpJE3NHJG0gZWUkqQQCOK9r0vxh4U1qcW+ka1Y30p/gt7mKVuBnojE9K+VvA37AX7JfgCWGfRvh9Y3U0C4SXUprnUHBAxkC5mkUE/7IFfUmi+D/AAz4eSOHw/o9jpsSDbi1t0hwAOOiA/rQfGKXMdWCCMjmio0B+gHapKBhRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAf/0v38ooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigApD0paKAGYNGDT6KBkRGeMGm7Mds1PRTJcY9iHb/s/lSbFPBUn6gVPRRcOWPYr+Sh42Y/Af4UvlDIOMY9h/hU9FDY1ZbEWz2z+VJtIPQ49OKmopAQhRngGn4NPooC8u4zBpMGpKKAuyPb7UhX1zUtFO41JkO0DpmlwfepaKfMDbIgD70uPapKKTZNr6sYBz0p9FFIenQKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooA//9P9/KKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooA//U/fyiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKAP/2Q==\" style=\"max-width: 100%;\"></td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"								</tr>\r\n" + 
				"								<tr>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"									<td>&nbsp;</td>\r\n" + 
				"								</tr>\r\n" + 
				"							</tbody>\r\n" + 
				"						</table><p><span style=\"font-size: xx-large;\">d'sa</span></p><p><span style=\"font-size: xx-large;\">爱上帝啥的hi哦等候i阿斯活动i啊是 大神都ii阿什顿等候i阿史都ii撒谎&nbsp;</span></p>", 99999999);
		System.out.println("ll:" + dString.trim());
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
		/*
		 * System.out.println("KKK:" + lista.size()); int i = 1; ArrayList<String>
		 * listFileName = new ArrayList<String>(); getAllFileName("C:\\img\\friends",
		 * listFileName);
		 */
		int i = 0;
		for (Article article : lista) {
			/*
			 * article.setArticleByUser(list.get(random.nextInt(list.size())).getUserId());
			 * article.setArticleModifytime(TimeUtil.getStringSecond());
			 * article.setArticleImg(listFileName.get(random.nextInt(listFileName.size())));
			 * int s = homeService.update(article); System.out.println("LLL:" + s + i); i =
			 * i + s;
			 */
			// article.setOutline(RemoveHTML.Html2Text(article.getArticleContent(),
			// 99999999));
			// homeService.update(article);

			if (article.getOutline() != null && article.getOutline().trim().length() > 0) {

			} else {
				i++;
				System.out.println("ID:" + article.getArticleId());
			}
			System.out.println(i);
		}

	}

	@Test
	public void addUser20() {
		Random random = new Random();
		List<String> list = new ArrayList<>();
		list.add("药药 切克闹");
		list.add("怪咖i");
		list.add("一二咔");
		list.add("biu biu biu");
		list.add("空调兽兽要来了*");
		list.add("中国老花朵@");
		list.add("割了动脉喝脉动@");
		list.add("我还有点小激动!");
		list.add("七彩鼻涕泡i!");
		list.add("空调兽兽要来了*");
		list.add("奥特蛋火了");
		list.add("丑女神");
		list.add("孟婆来杯优乐美");
		list.add("该用户已成仙");
		list.add("该用户无法显示昵称");
		list.add("熊二别怕有俺在呢");
		list.add("作业粉碎机.");
		list.add("小怪兽ゞ");
		list.add("法克鱿小面包");
		list.add("24k女神经病");
		list.add("青青草原杠把子");
		list.add("大王叫我来巡山");

		List<String> list2 = new ArrayList<>();
		list2.add("男");
		list2.add("女");
		ArrayList<String> listFileName = new ArrayList<String>();
		getAllFileName("C:\\img\\friends", listFileName);
		System.out.println("LLLL" + listFileName.size());
		int i = 0;
		for (String string : list) {

			User user = new User();
			user.setUserId(BuildUuid.getUuid());
			user.setUserAccount(GenerateAccount.nextInt8());
			user.setUserEmail(user.getUserAccount() + "qq.com");
			user.setUserIsBanned("0");
			user.setUserName(list.get(i));
			i++;
			user.setUserPassword("123");
			user.setUserIsActivation("1");
			user.setUserPortrait(listFileName.get(random.nextInt(listFileName.size())));
			user.setUserType("user");
			user.setUserSex(list2.get(random.nextInt(list2.size())));
			user.setUserSynopsis("大家好我系" + user.getUserName());
			user.setUserCreatetime(TimeUtil.getStringSecond());
			user.setUserModifytime(TimeUtil.getStringSecond());
			homeService.addUser20(user);
		}

	}

	public static String[] getFileName(String path) {
		File file = new File(path);
		String[] fileName = file.list();
		return fileName;
	}

	public static void getAllFileName(String path, ArrayList<String> fileName) {
		File file = new File(path);
		File[] files = file.listFiles();
		String[] names = file.list();
		if (names != null)
			fileName.addAll(Arrays.asList(names));
		for (File a : files) {
			if (a.isDirectory()) {
				getAllFileName(a.getAbsolutePath(), fileName);
			}
		}
	}

	public static void main(String[] args) {
		String[] fileName = getFileName("C:\\img\\friends");
		ArrayList<String> listFileName = new ArrayList<String>();
		getAllFileName("C:\\img\\friends", listFileName);

	}

	@Test
	public void testDemo() {
		JiebaSegmenter segmenter = new JiebaSegmenter();
		String[] sentences = new String[] { "的哥" };
		List<String> list = new ArrayList<>();
		for (String sentence : sentences) {
			for (SegToken words : segmenter.process(sentence, SegMode.INDEX)) {
				list.add(words.word);
			}
		}
		for (String string : list) {
			System.out.println(string);
		}
	}

	static {

	}

}
