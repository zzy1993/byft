package com.zhiyuan.uber.domain;

public class Message {
    private String name;
    private String test;

    public Message(String name, String test){
        this.name = name;
        this.test = test;
    }

    public String getName(){
        return name;
    }

    public String getTest(){
        return test;
    }
}

