package com.friendsystem.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("img")
public class ShowImgController {
	private static final long serialVersionUID = 1L;
	private InputStream inputStream;

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public void imgShow(String imgName) {
		System.out.println("okk:" + imgName);
		String path = "C://friends/img/";
		path = path + imgName;
		File file = new File(path);
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
