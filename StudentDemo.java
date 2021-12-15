package com.itheima_02;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true){
            System.out.println("--------学生管理--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    delStudent(array);
                    break;
                case "3":
                    chaStudent(array);
                    break;
                case "4":
                    showStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用！");
                    System.exit(0);
            }
        }

    }
    public static void addStudent(ArrayList<Student> array) {
        Student stu = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的学号：");
        stu.setsidNum(scanner.nextLine());
        System.out.println("请输入学生的姓名：");
        stu.setName(scanner.nextLine());
        System.out.println("请输入学生的年龄：");
        stu.setAge(scanner.nextLine());
        System.out.println("请输入学生的地址：");
        stu.setAddress(scanner.nextLine());
        array.add(stu);
    }
    public static void delStudent(ArrayList<Student> array) {
        System.out.println("请输入你要删除学生的学号：");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getsidNum().equals(num)) {
                array.remove(i);
                break;
            }
        }
    }
    public static void chaStudent(ArrayList<Student> array) {
        System.out.println("请输入你要修改学生的学号：");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getsidNum().equals(num)) {
                System.out.println("学号：" + s.getsidNum() + ",姓名：" + s.getName() + "，年龄：" + s.getAge() + "，地址："+s.getAddress());
                System.out.println("请输入你将该学生学号修改为：");
                s.setsidNum(scanner.nextLine());
                System.out.println("请输入你将该学生姓名修改为：");
                s.setName(scanner.nextLine());
                System.out.println("请输入你将该学生年龄修改为：");
                s.setAge(scanner.nextLine());
                System.out.println("请输入你将该学生地址修改为：");
                s.setAddress(scanner.nextLine());
                array.set(i,s);
                break;
            }
        }
    }
    public static void showStudent(ArrayList<Student> array) {
        System.out.println("--------学生信息--------");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println("学号：" + s.getsidNum() + ",姓名：" + s.getName() + "，年龄：" + s.getAge() + "，地址："+s.getAddress());
        }
    }
}
