package com.neuedu.test;

import java.util.Scanner;

    public class StudentManger {
        public void admin(){
            System.out.println("请输入用户名");
            String name = input.next();
            System.out.println("请输入密码");
            String psw = input.next();

            showMenu();
        }


        private Scanner input = new Scanner(System.in);
        public void showMenu(){
            System.out.println("*欢迎来到学生管理系统 *");
            System.out.println("*1：增加*");
            System.out.println("*2：删除*");
            System.out.println("*3：修改*");
            System.out.println("*4：查询*");
            System.out.println("*5：退出*");
            System.out.println("您想选择的操作是：");

            int value = input.nextInt();
            switch (value){
                case 1:
                    add();
                case 2:
                    del();
                case 3:
                    upd();
                case 4:
                    sel();
            }
        }
        public void add(){

        }
        public void del(){

        }
        public void upd(){

        }
        public void sel(){

        }
    }


