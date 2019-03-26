package com.busy;

import com.busy.annotation.Init;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {
    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException {
        user user = new user();

        Method[] methods = user.class.getMethods();
        for (Method method:methods){
            if(method.isAnnotationPresent(Init.class)){
                Init init = method.getAnnotation(Init.class);
                method.invoke(user,init.value());
            }
        }
        System.out.println(user.getUserName());
    }
}
