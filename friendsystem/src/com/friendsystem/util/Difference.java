package com.friendsystem.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算时间差
 * 
 * @author LW
 *
 */
public class Difference {
	public static Boolean diff(String days) throws ParseException {
		boolean b = true;
		int oneDay = 86400000;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = TimeUtil.getStringSecond();
		Date d1 = df.parse(today);
		Date d2 = df.parse(days);
		long diff = d1.getTime() - d2.getTime();// 这样得到的差值是微秒级别
		if (diff > oneDay) {
			b = false;
			return b;
		}
		return b;

	}

}
