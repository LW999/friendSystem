package com.friendsystem.controller;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("img")
public class ShowImgController {
	@RequestMapping("user")
	public String IoReadImage(String fileFileName, HttpServletResponse response) throws IOException {
		fileFileName = new String(fileFileName.getBytes("ISO8859-1"), "UTF-8");// 解决图片中文路径乱码
		if (fileFileName != null && fileFileName.trim().length() > 0) {

			String linkurl = "C:\\img\\friends\\" + fileFileName;
			FileInputStream in = new FileInputStream(linkurl);
			ServletOutputStream out = null;
			response.setContentType("image/png");
			try {
				out = response.getOutputStream();
				// 读取文件流
				int len = 0;
				byte[] buffer = new byte[1024 * 10];
				while ((len = in.read(buffer)) != -1) {
					out.write(buffer, 0, len);
				}
				out.flush();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				out.close();
				in.close();
			}
		}
		return null;

	}

}
