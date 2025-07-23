package com.shihaowang.test;

public class SmsServiceImpl implements SmsService{


    @Override
    public String send(String message) {
        System.out.println("Sending SMS: " + message);
        return "SMS sent successfully!";
    }
}
