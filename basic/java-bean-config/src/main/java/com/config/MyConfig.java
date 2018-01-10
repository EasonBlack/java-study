package com.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.User;
import com.entity.Address;


@Configuration
public class MyConfig {
    @Bean
    public User user(){
        User user = new User();
        return user;
    }

    @Bean(name={"myaddress"})
    public Address address(){
        Address addr = new Address("99999999");
        return addr;
    }
}