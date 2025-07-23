package com.shihaowang.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.shihaowang.test.generic; // Import the generic class
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException,NoSuchFieldException {


//        // Create an array of integers
//        Integer[] intArray = {1, 2, 3, 4, 5};
//
//        //use the generic method to print the array
//        generic.printArray(intArray);
//
//        // Create an array of strings
//        String[] strArray = {"Hello", "World", "Generics", "in", "Java"};
//
//        //use the generic method to print the array
//        generic.printArray(strArray);
        ///////////////////////////////////////////////////////////////////////////////////////////////
//        Class <?> targetClass = Class.forName("com.shihaowang.test.TargetObject");
//        TargetObject targetObject = (TargetObject) targetClass.getDeclaredConstructor().newInstance();
//        /**
//         * using reflection to call the private method
//         */
//        //Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
//        Method[] methods = targetClass.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//        }
//
//        /**
//         * using reflection to call the public method
//         */
//        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
//        publicMethod.invoke(targetObject, "JavaGuide");
//
//        /**
//         * using reflection to access the private field
//         */
//        Field field = targetClass.getDeclaredField("value");
//        field.setAccessible(true);  // 关闭安全检查
//        field.set(targetObject, "JavaGuide");
//
//        // Now call the private method to see the updated value
//        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
//        privateMethod.setAccessible(true);
//        privateMethod.invoke(targetObject);


        ///////////////////////////////////////////////////////////////////////////////////////////////


//        // Create an instance of SmsServiceImpl
//        SmsService smsService = new SmsServiceImpl();
//        // Create a proxy for SmsService
//        SmsProxy smsProxy = new SmsProxy(smsService);
//        // Use the proxy to send an SMS
//        smsProxy.send("Hello, this is a test message!");


        ///////////////////////////////////////////////////////////////////////////////////////////////
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");




        //SpringApplication.run(TestApplication.class, args);
    }

}
