package com.hanyixin.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//获得当前的日期
		String string = format.format(new Date());
		//新的日期
		String s2 = string.substring(0, 8)+"-01 00:00:00";
		System.out.println("s2 "+s2);
		//返回结果
		return format.parse(s2);
		
	}
}
