package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;  

import com.config.MyConfig;
import com.entity.User;
import com.entity.Address;

public class Simple {
    public static void main(String[] args){

        ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
   
        User u = (User)ctx.getBean("user");
        Address addr = (Address)ctx.getBean("myaddress");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        u.setUsername("Eason");
        System.out.println(addr.getName());
        System.out.println(u.getUsername());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
    }
}