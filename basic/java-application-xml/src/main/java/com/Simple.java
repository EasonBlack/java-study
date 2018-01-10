package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BeanInterface;

public class Simple {
    public static void main(String[] args){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
        BeanInterface sb = (BeanInterface)ctx.getBean("someBean");
        System.out.println(sb.getTest());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
    }
}