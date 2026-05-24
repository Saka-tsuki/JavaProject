package com.neuedu.tms.view;

import com.neuedu.tms.pojo.TUser;
import com.neuedu.tms.service.TUserService;

import java.util.List;

public class AdminSearchMenu {
    public void execute() {
        TUserService us=new TUserService();
        //list
        List<TUser> list=us.findAll();
        //for(元素类型 别名:循环对象)
        for(TUser user:list){
            System.out.println(user);
        }

    }
}
