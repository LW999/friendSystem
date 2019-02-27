package com.friendsystem.util;


import java.util.Date;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;


public class MailContent
{
    public static final String ACCOUT = "835621887@qq.com";// 邮箱帐号

    /**
     * 邮件内容配置
     * 
     * @param session
     * @param mail
     * @return
     * @throws Exception
     */
    public static MimeMessage createEmail(Session session, String mail, String code,
                                          String account)
        throws Exception
    {
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
                         + "<h3><a href='http://www.wxy999.cn:8080/friendsystem/register/activation.do?code="
                         + code
                         + "'>http://134.175.37.68:8080/friendsystem/register/activation.do?code="
                         + code + "</href>" + "</h3></body></html>";
        msg.setContent(content, "text/html;charset=UTF-8");
        // 设置显示的发件时间
        msg.setSentDate(new Date());
        // 保存设置
        msg.saveChanges();
        return msg;
    }

}
