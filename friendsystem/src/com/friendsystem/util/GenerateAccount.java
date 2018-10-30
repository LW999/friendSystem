package com.friendsystem.util;

import java.util.Random;

/**
 * 随机生成八位数账号
 * 
 * @author 哈哈哈哈哈哈
 *
 */
public class GenerateAccount {
	public static String nextInt8() {
		Random random = new Random();
		String result = "";
		for (int i = 0; i < 8; i++) {
			result += random.nextInt(10);
		}
		// System.out.print(result);
		return result;

	}
}
