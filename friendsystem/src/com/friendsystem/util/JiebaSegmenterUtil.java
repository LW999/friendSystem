package com.friendsystem.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.junit.Test;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;
import com.huaban.analysis.jieba.SegToken;

public class JiebaSegmenterUtil {

	private static final List<String> notWords = new ArrayList<>();
	static {
		Properties properties = new Properties();
		try {
			properties.load(
					new JiebaSegmenterUtil().getClass().getClassLoader().getResourceAsStream("not_words.properties"));
			String property = properties.getProperty("k");
			property = new String(property.getBytes("ISO-8859-1"), "UTF-8");
			String[] j = property.split(",");
			notWords.addAll(Arrays.asList(j));
		} catch (IOException e) {
		}
	}

	public static List<String> testDemo(String text) {
		JiebaSegmenter segmenter = new JiebaSegmenter();
		String[] sentences = new String[] { text };
		List<String> list = new ArrayList<>();
		for (String sentence : sentences) {
			for (SegToken words : segmenter.process(sentence, SegMode.INDEX)) {
				if (notWords.contains(words.word) || list.contains(words.word) || "".equals(words.word.trim()))
					continue;
				list.add(words.word);
			}
		}
		return list;
	}

	@Test
	public void test() {
		for (String string : testDemo("Python	学习线路图PyCharm教程 Pycharm介绍 Pycharm安装")) {
			System.out.println(string);
		}
	}
}
