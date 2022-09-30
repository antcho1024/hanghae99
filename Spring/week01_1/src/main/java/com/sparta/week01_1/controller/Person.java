package com.sparta.week01_1.controller;

public class Person {
    private String name;
    private int age;
    private String job;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setJob(String job){
        this.job = job;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    public String getJob(){return job;}

}
