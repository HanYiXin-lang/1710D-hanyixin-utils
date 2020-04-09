package com.hanyixin.common.utils;

import java.io.File;
import java.io.InputStream;

public class StreamUtil {

	
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(){
		
		
		
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src){
		
		File file = new File("");
		String s1 = new String();
		return s1;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)
	*/
	public static String readTextFile(File txtFile){
		File file = new File("");
		String s1 = new String();
		return s1;
		
	}
}
