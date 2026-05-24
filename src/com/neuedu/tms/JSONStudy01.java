package com.neuedu.tms;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neuedu.tms.pojo.TUser;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSONStudy01 {
	public static void main(String[] args) throws IOException {
		File file01=new File("D:\\Files\\eclipse\\workspace\\JavaProject\\data\\users.txt");
        FileWriter fw= null;
		//目的：把一个管理员存到文件里
		//1.实例化一个对象，类型为TUser
		//TUser是类，admin01是对象
		//给对象赋值第一种方法，无参构造+set方法
        try{
        TUser admin01=new TUser();
		admin01.setUserName("admin01");
		admin01.setPassword("123456");
		admin01.setId(1);
		//第二种给对象赋值的方法，是利用有参构造
		TUser admin02=new TUser(2,"admin02","654321");
		System.out.println(admin01.getUserName());
		System.out.println(admin02.getUserName());
		//2.把对象转换成json字符串格式
		//实例化一个json转换工具类
		ObjectMapper om=new ObjectMapper();
		//调用工具类的writeValueAsString object->string
		String str=om.writeValueAsString(admin01);
		System.out.println(str);
		//3.调用java文件操作相关的方法存到文件里
		//用字符流相关的类FileWriter BUfferedWriter
        //向文件中写默认为覆盖而不是追加
		fw=new FileWriter(file01,true);
		fw.write(str);
		//1.先从文件中把对象读出来
		//2.把字符串转换成json格式
			TUser userRead = om.readValue(str, TUser.class);
			System.out.println(userRead);
	} catch (Exception e){
		throw new RuntimeException(e);
	}finally {
		fw.close();
		}
	}
}
