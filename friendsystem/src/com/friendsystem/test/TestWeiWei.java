package com.friendsystem.test;

import java.util.Date;
import java.util.List;
import java.util.Properties;

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

import com.friendsystem.DTO.User_LikeDTO;
import com.friendsystem.pojo.Project;
import com.friendsystem.pojo.User;
import com.friendsystem.service.HomeService;
import com.friendsystem.service.LoginService;
import com.friendsystem.service.ManagementService;
import com.friendsystem.service.RegisteredService;
import com.friendsystem.service.TestService;
import com.friendsystem.util.BuildUuid;
import com.friendsystem.util.GenerateAccount;
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
	@Resource(name = "testService")
	private TestService testService;

	@Test
	public void test1() {
		List<User> listU = testService.getAll();
		System.out.println("kkkk:" + listU);
	}

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
		List<User_LikeDTO> listRandomUserDTO = homeService.getRandomUsers();
		System.out.println("dto:" + listRandomUserDTO);
	}
}
