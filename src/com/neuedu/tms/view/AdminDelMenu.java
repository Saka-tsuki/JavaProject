package com.neuedu.tms.view;

import com.neuedu.tms.service.TUserService;

import java.util.Scanner;

public class AdminDelMenu implements IMenu{
    public void execute() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除人员的id");
        //获取用户输入的id
        int id=sc.nextInt();
        TUserService service = new TUserService();
        //调用service进行删除
        String result=service.delById(id);
        //打印处理结果
        System.out.println(result);
    }
}
