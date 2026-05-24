package com.neuedu.tms.view;

import java.util.Scanner;

public class AdminMainMenu implements  IMenu{
    public void execute() {
        Scanner sc=new Scanner(System.in);
        while(true) {
            //@TODO  菜单需要完善
            StringBuilder sb=new StringBuilder();
            sb.append("==================管理员===============================================================================");
            sb.append("\n");
            sb.append("用户管理\n");
            sb.append("     1-- 添加用户\t2-- 查询所有用户信息\t 3-- 根据条件查询用户信息\t 4-- 修改用户\t 5-- 删除用户\t\n");
            sb.append("护理管理\n" );
            sb.append("     6--查询所有护理级别\t 7--添加护理级别\t 8--查询所有护理项目\t 9--添加护理项目\t 10-查询管家护理记录\t 11-客户护理级别设置\t\n" );
            sb.append("床位管理\n" );
            sb.append("     12--床位示意图\t 13--添加床位\t 14--修改床位\t 15-调换床位\t\n" );
            sb.append("客户管理\n" );
            sb.append("     16--入住登录\t  17--外出审核\t 18--退住审核\t 19-查询外出信息\t 20-查询退住信息\t\n" );
            sb.append("健康管家管理\n" );
            sb.append("     21--管家列表\t  22--设置服务对象\t 23--服务关注\t 24-服务续费\t 25-服务购买\t\n" );
             System.out.println(sb.toString());
            System.out.println("请选择");
            //System.out.println("1.添加员工 2.查询所有员工信息  3.根据条件查询员工信息 4.修改员工 5.删除员工 6.退出");
            //思考：如何先将用户信息存储到文件里，方便后续的查询或修改？
            //获取用户输入
            int result = sc.nextInt();//用result变量接收用户输入
            switch (result) {
                case 1:
                    //1.添加员工
                    AdminAddMenu alm = new AdminAddMenu();
                    alm.execute();
                    break;
                case 2:
                    //2.查询所有员工信息
                    AdminSearchMenu asm=new AdminSearchMenu();
                    asm.execute();
                    break;
                case 3:
                    //3.根据条件查询管理员
                    AdminSearchParamsMenu asp=new AdminSearchParamsMenu();
                    asp.execute();
                    break;
                case 4:
                    //4.修改用户
                    AdminUpdateMenu aum=new AdminUpdateMenu();
                    aum.execute();
                    break;
                case 5:
                    //5.删除用户
                    AdminDelMenu adm=new AdminDelMenu();
                    adm.execute();
                    break;
                 case 6:
//                /退出
                    System.exit(1);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
}
