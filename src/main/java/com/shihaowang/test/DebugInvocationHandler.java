package com.shihaowang.test;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class DebugInvocationHandler implements InvocationHandler{
    private final Object target;

    public DebugInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException{

        // Print method name and arguments before invoking the method
        System.out.println("Invoking method: " + method.getName());
        Object result = method.invoke(target, args);
        // Print the result after invoking the method
        System.out.println("Method result: " + result);
        return result;
    }
}
