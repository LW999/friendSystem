package com.friendsystem.controller;

import java.io.File;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("up")
public class Upload {
	@RequestMapping("/upload")
	public String upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("llll");
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			Iterator iter = multiRequest.getFileNames();
			
			while (iter.hasNext()) {
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					
					System.out.println("dddd:"+file.toString());
					String path = "E:/img/" ;
					path = path +file.getOriginalFilename();
					
					System.out.println("kkkk:"+path);
					file.transferTo(new File(path));
				}
			}
		}
		return "showImage";
	}

}
