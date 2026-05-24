package com.neuedu.tms.service;

import com.neuedu.tms.dao.TUserDao;
import com.neuedu.tms.pojo.TUser;

import java.io.IOException;
import java.util.List;

public class TUserService {
	//DAO层专注持久化
    TUserDao userDao=new TUserDao();

    public TUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(TUserDao userDao) {
        this.userDao = userDao;
    }

    /**
     *
     *
     * @param user 用户
     * @return 成功/失败的字符串
     */
    public String addUser(TUser user){
        System.out.println("传过来的要添加的用户"+user);
        System.out.println("稍候将存到文件中");
        //1.需要验证用户名、密码、用户类型是否是合法的(后续常用完成)
        //2.需要验证用户名是否重复(后续常用完成)
        //3.如何验证通过，调用 dao层进行存储
        String result= null;
        try {
            result = userDao.addUser(user);
        } catch (IOException e) {
            result="添加失败";

        }
        //返回存储结果
        return result;
    }

    public List<TUser> findAll() {
        List<TUser> list=userDao.findAll();
        return list;
    }
    
    public TUser findByUserName(String inputUserName) {
    	return userDao.findByUserName(inputUserName);
    }
    public TUser findById(Integer id) {
        return userDao.findById(id);
    }
    
    public String updateUser(TUser user) {
    	//@TODO 验证
    	boolean db_result= userDao.updateUser(user);
    	if(db_result) {
    		return "修改成功";
    	}else {
    		return "修改失败";
    	}
    }
}
