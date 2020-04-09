package com.hanyixin.common.test;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import com.hanyixin.common.utils.DateUtil;
import com.hanyixin.common.utils.FileUtil;

public class DateTest {

	@Test
	public void testDate() {
		//测试月份返回结果
		try {
			Date initMonth = DateUtil.getDateByInitMonth(new Date());
			
			System.out.println("结果是 "+initMonth);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sql字符串
		String sql = "select * from orders where create_time>='{1}' and create_time<='{2}' ";
		System.out.println(sql);
	}
	
	@Test
	public void file() {
		//字符串截取
		String name = FileUtil.getExtendName(new String());
		//输出截取结果
		System.out.println(name);
	}
}
