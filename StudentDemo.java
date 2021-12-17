package com.itheima_02;


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
                    System.out.println("添加学生成功！");
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

    //增加学生信息
    public static void addStudent(ArrayList<Student> array) {
        Student stu = new Student();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入学生的学号：");
            String num = scanner.nextLine();
            if (!isUsed(array, num)){//判断学号是否被使用
                stu.setsidNum(num);
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        stu.setName(scanner.nextLine());
        System.out.println("请输入学生的年龄：");
        stu.setAge(scanner.nextLine());
        System.out.println("请输入学生的地址：");
        stu.setAddress(scanner.nextLine());
        array.add(stu);
    }

    //删除学生信息
    public static void delStudent(ArrayList<Student> array) {
        int i = 0;
        boolean flag = false;
        if (array.size() == 0) {
            System.out.println("请先添加学生信息");
        }else {
            System.out.println("请输入你要删除学生的学号：");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();
            for (i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getsidNum().equals(num)) {
                    flag = true;
                    array.remove(i);
                    System.out.println("删除学生成功！");
                    break;

                }
            }
        }
        if (flag == false) {
            System.out.println("无该学生信息！");
        }
    }

    //改变学生信息
    public static void chaStudent(ArrayList<Student> array) {
        int i = 0;
        boolean flag = false;
        if (array.size() == 0) {
            System.out.println("请先添加学生信息");
        }else {
            System.out.println("请输入你要修改学生的学号：");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();
            for (i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getsidNum().equals(num)) {
                    flag = true;
                    System.out.println("学号：" + s.getsidNum() + ",姓名：" + s.getName() + "，年龄：" + s.getAge() + "，地址：" + s.getAddress());
                    System.out.println("请输入你将该学生学号修改为：");
                    s.setsidNum(scanner.nextLine());
                    System.out.println("请输入你将该学生姓名修改为：");
                    s.setName(scanner.nextLine());
                    System.out.println("请输入你将该学生年龄修改为：");
                    s.setAge(scanner.nextLine());
                    System.out.println("请输入你将该学生地址修改为：");
                    s.setAddress(scanner.nextLine());
                    array.set(i, s);
                    System.out.println("修改学生成功！");
                    break;
                }
            }
            i++;
            if (flag == false) {
                System.out.println("无该学生信息！");
            }
        }
    }

    //展示学生信息
    public static void showStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("请先添加学生信息");
        }else{
            System.out.println("--------学生信息--------");
            System.out.println("学号\t姓名\t年龄\t地址");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getsidNum() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t"+s.getAddress());
            }
        }

    }

    //判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String num) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getsidNum().equals(num)) {
                System.out.println("该学号已被占用，请重新输入！");
                return true;
            }
        }
        return false;
    }
}
