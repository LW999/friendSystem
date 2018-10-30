package com.friendsystem.service;

import java.util.Date;
import java.util.Properties;

import javax.annotation.Resource;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.stereotype.Service;

import com.friendsystem.mapper.UserMapper;
import com.friendsystem.pojo.User;
import com.friendsystem.pojo.UserExample;
import com.friendsystem.pojo.UserExample.Criteria;
import com.friendsystem.util.BuildUuid;
import com.friendsystem.util.GenerateAccount;
import com.friendsystem.util.TimeUtil;

@Service("registeredService")
public class RegisteredService {
	@Resource
	private UserMapper userMapper;

	/**
	 * 查询邮箱是否注册过
	 * 
	 * @param mail
	 * @return
	 */
	public String getUserByMail(String mail) {
		System.out.println("kkk:" + mail);
		if (mail != null && mail.trim().length() > 0) {
			User user = userMapper.selectUserByMail(mail);
			if (user != null) {
				if (user.getUserIsActivation().equals("0")) {
					return "NoActivation";// 返回未激活
				}
				return "HasBeenRegistered";// 返回已被激活
			}
			return "Pass";// 可以使用该邮箱
		}
		return null;
	}

	/**
	 * 保存并且发送邮件
	 * 
	 * @param mail
	 * @param password
	 * @param name
	 * @return
	 */
	public static final String SMTPSERVER = "smtp.qq.com";// 邮箱服务器地址（用QQ还是网易看需求，我这里用的是网易邮箱）
	public static final String SMTPPORT = "465"; // 邮箱服务器默认端口
	public static final String ACCOUT = "835621887@qq.com";// 邮箱帐号
	public static final String PWD = "kohsfsungfmzbeff";// 这是授权码，并不是邮箱的登录密码
	private static final User User = null;

	public String saveUserAndSedMail(String mail, String password, String name) throws Exception {
		if (mail != null && mail.trim().length() > 0 && password != null && password.trim().length() > 0 && name != null
				&& name.trim().length() > 0) {
			// 保存用户
			User user = new User();
			user.setUserId(BuildUuid.getUuid());
			user.setUserName(name);
			user.setUserPassword(password);
			user.setUserEmail(mail);
			user.setUserIsBanned("0");// 0是不封禁，1是封禁
			String code = BuildUuid.getUuid();
			String account = GenerateAccount.nextInt8();
			user.setCode(code);

			user.setUserType("user");
			user.setUserAccount(account);
			user.setUserIsActivation("0");// 0是未激活，1是激活
			user.setUserSex("保密");
			user.setUserCreatetime(TimeUtil.getStringSecond());
			user.setUserModifytime(TimeUtil.getStringSecond());
			System.out.println("user::" + user);
			userMapper.insert(user);
			// 给用户发送邮件
			// 创建邮件配置
			Properties props = new Properties();
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
			MimeMessage message = createEmail(session, mail, code, account);
			// 获取传输通道
			Transport transport = session.getTransport();
			transport.connect(SMTPSERVER, ACCOUT, PWD);
			// 连接，并发送邮件
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			return "邮件发送成功!" + account;
		}
		return null;
	}

	/**
	 * 邮件内容配置
	 * 
	 * @param session
	 * @param mail
	 * @return
	 * @throws Exception
	 */
	public static MimeMessage createEmail(Session session, String mail, String code, String account) throws Exception {
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

		String content = "<html><head></head>" + "<body><h1>欢迎注册阿伟社交系统,您的账号为:" + account
				+ "</h1><br></br><h2>点击以下链接完成注册</h2>"
				+ "<h3><a href='http://localhost:8080/friendsystem/register/activation.do?code=" + code
				+ "'>http://localhost:8080/friendsystem/register/activation.do?code=" + code + "</href>" + "</h3></body></html>";
		msg.setContent(content, "text/html;charset=UTF-8");
		// 设置显示的发件时间
		msg.setSentDate(new Date());
		// 保存设置
		msg.saveChanges();
		return msg;
	}

	/**
	 * 判断code是否正确
	 * 
	 * @param code
	 * @return
	 */
	public String getUserByCode(String code) {
		if (code != null && code.trim().length() > 0) {
			User user = userMapper.selectUserByCode(code);
			if (user != null) {
				if (user.getUserIsActivation().equals("1")) {
					System.out.println("已经被激活，不能重复激活");
					// 已经被激活，不能重复激活
					return "RepeatActivation";
				} else {
					System.out.println("dddd" + user);
					System.out.println("lllL:" + user.getCode());
					if (user.getCode().equals(code)) {
						return "Pass";// code一致可以通过
					}
					
					return "Error";
				}
			}
			System.out.println("code错误");
		}
		return "Error";
	}

	/**
	 * 激活
	 * 
	 * @param code
	 */
	public void activation(String code) {
		if (code != null && code.trim().length() > 0) {
			User user = userMapper.selectUserByCode(code);
			user.setUserIsActivation("1");
			user.setUserModifytime(TimeUtil.getStringSecond());
			UserExample userExample = new UserExample();
			Criteria criteria = userExample.createCriteria();
			criteria.andUserIdEqualTo(user.getUserId());
			userMapper.updateByExampleSelective(user, userExample);
		}
	}

}
