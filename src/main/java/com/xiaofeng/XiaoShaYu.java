package com.xiaofeng;

import java.util.Scanner;

public class XiaoShaYu {

        public static void main(String[] args) {

            //定义一个字符串，用来接收整个收支的明细
            String details = "";

            // 添加while 循环条件
            while (true){
                System.out.println("-----欢迎使用小鲨鱼记账-----");
                System.out.println("1、收支明细");
                System.out.println("2、登记收入");
                System.out.println("3、登记支出");
                System.out.println("4、退出");
                System.out.println("请输入你要选择的功能: ");

                //键盘录入，扫描器
                Scanner sc =new Scanner(System.in);

                //接受键盘录入的int类型的数据
                int choice = sc.nextInt();

                //初始化余额的金额为0
                double balance = 0;

                //对录入的choice进行过滤
                while (choice !=1 & choice!=2 & choice != 3 & choice != 4){
                    System.out.println("输入错误，请重新输入！");
                    int  newchoice = sc.nextInt(); //重新输入键盘事件
                    choice = newchoice; //覆盖原来的键盘事件
                }

                //键盘事件的判断
                switch(choice){
                    case 1:
                        System.out.println("记账系统》》》收支明细");
                        /*如果直接输出detail，会在最后多一个行
                        System.out.println(details);*/
                     /*  String s =  details.substring(0,details.length()-1); //字符串的截取
                        System.out.println(s); */
                        if (details!=""){
                            System.out.println(details.substring(0,details.length()-1));
                        }else {
                            System.out.println(details);
                        }
                        break;
                    case 2:
                        System.out.println("记账系统》》》登记收入");
                        System.out.println("请录入收入金额:");
                        double income = sc.nextDouble(); //double类型的字符类型
                        System.out.println("请录入收入的说明：");
                        String incomeDetails = sc.next();
                        balance += income;
                        details = details
                                + "收入："
                                + income
                                + ",收入说明："
                                + incomeDetails + "，账户余额："
                                + balance + "\n";
                        break;
                    case 3:
                        System.out.println("记账系统》》》登记支出");
                        System.out.println("请录入支出金额： ");
                        double outcome = sc.nextDouble();
                        System.out.println("请录入支出说明：");
                        String outcomeDetails = sc.next();
                        balance -= outcome;
                        details = details
                                + "支出:"
                                + outcome + ",支出说明："
                                + outcomeDetails
                                + "，账户余额："
                                + balance + "\n" ;
                        break;
                    case 4:
                        System.out.println("记账系统》》》退出功能");
                        System.out.println("确定是否要退出？Y/N: ");
                        String isExit = sc.next();
                        switch (isExit){
                            case "Y" :
                                System.out.println("系统退出，欢迎下次使用！");
                                return;// 结束当前运行方法
                        }

                }
            }
        }
    }


