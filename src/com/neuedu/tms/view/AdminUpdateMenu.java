package com.neuedu.tms.view;

import java.util.Scanner;

import com.neuedu.tms.pojo.TUser;
import com.neuedu.tms.service.TUserService;

public class AdminUpdateMenu implements IMenu {
	@Override
	public void execute(){
		//添加所有的内容都是全新的，ID是系统生成的
		//修改是修改已有的，ID是已存的
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入id");
		int id=sc.nextInt();
		System.out.println("请输入用户名");
		String userName=sc.next();
		System.out.println("请输入新密码");
		String password=sc.next();
		System.out.println("请输入用户类型 1-管理员 2-护工");
		int userType=sc.nextInt();
		//把上述信息包装到Tuser里，传给service进行处理
		TUser user=new TUser(id,userName,password,userType);
		TUserService service=new TUserService();
		String result=service.updateUser(user);
		System.out.println(result);
	}
}
