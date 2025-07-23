package com.shihaowang.test;

public class SmsProxy implements SmsService {

    private SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        // Add pre-processing logic here
        System.out.println("Pre-processing before sending SMS...");

        // Call the actual send method
        String result = smsService.send(message);

        // Add post-processing logic here
        System.out.println("Post-processing after sending SMS...");

        return result;
    }
}
