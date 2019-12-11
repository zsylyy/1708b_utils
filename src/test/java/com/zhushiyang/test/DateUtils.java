package com.zhushiyang.test;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	//方法1：根据传入的日期获取年龄
	//示例:
	public static int getAge (Date src) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(src);
		int age = ca.get(Calendar.YEAR);
		Calendar cad = Calendar.getInstance();
		int age2 = cad.get(Calendar.YEAR);
		return age2-age;
	
	}
	//方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	//示例:
	public static Date getDateByMonthInit (Date src) {
		Calendar ca=Calendar.getInstance();
		ca.setTime(src);
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH);
		ca.clear();
		ca.set(Calendar.YEAR,year);
		ca.set(Calendar.MONTH, month);
		ca.set(Calendar.HOUR, 0);
		return ca.getTime();
	//TODO
	}
	
	//方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	//示例:
	public static Date getDateByMonthLast(Date src) {
		Calendar ca=Calendar.getInstance();
		ca.setTime(src);
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH);
		ca.clear();
		ca.set(Calendar.HOUR, 0);
		ca.set(Calendar.YEAR,year);
		ca.set(Calendar.MONTH, month+1);
		long time = ca.getTime().getTime();
		return new Date(time-1);
	//TODO
	}
	//方法4：求未来日期离今天还剩的天数
	//示例:
	public static int getDaysByFuture (Date future) {
		Date date=new Date();
		return (int)(future.getTime()-date.getTime())/(60*60*24*1000);
	//TODO
	}

	//方法5：求过去日期离今天过去的天数
	//示例:
	public static int getDaysByDeparted (Date departed) {
		Date date=new Date();
		return (int)(departed.getTime()-date.getTime())/(60*60*24*1000);
	
	}

}
