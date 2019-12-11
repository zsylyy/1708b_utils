package com.zhushiyang.test;

import java.text.DateFormat;
import java.util.Date;

public class Test {

	@org.junit.Test
	public void getAge(){
		int age = DateUtils.getAge(new Date());
		System.out.println(age);
	}
	@org.junit.Test
	public void getDateByMonthInit(){
		Date dateByMonthInit = DateUtils.getDateByMonthInit(new Date());
		System.out.println(dateByMonthInit);
	}
	@org.junit.Test
	public void getDateByMonthLast(){
		Date dateByMonthLast = DateUtils.getDateByMonthLast(new Date());
		System.out.println(dateByMonthLast);
	
	}
	@org.junit.Test
	public void getDaysByFuture(){
		int daysByFuture = DateUtils.getDaysByFuture(new Date());
		System.out.println(daysByFuture);
	    
	
	}
	@org.junit.Test
	public void getDaysByDeparted(){
		int daysByDeparted = DateUtils.getDaysByDeparted(new Date());
		System.out.println(daysByDeparted);
	    
	
	}
}
