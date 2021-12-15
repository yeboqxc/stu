package com.itheima_02;

public class Student {
    private String sidNum;
    private String name;
    private String age;
    private String address;

    public Student() {
    }

    public String getsidNum() {
        return sidNum;
    }

    public void setsidNum(String sidNum) {
        this.sidNum = sidNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
