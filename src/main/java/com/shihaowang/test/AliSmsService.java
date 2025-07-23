package com.shihaowang.test;

public class AliSmsService {


    public String send(String message){
        System.out.println("sending SMS via Aliyun: " + message);
        return message;
    }
}
