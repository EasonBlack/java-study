package com.eason;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eason.Store;
import com.eason.StoreRepository;
import com.eason.User;
import com.eason.UserRepository;

@SpringBootApplication
@RestController
public class Application {

    @Autowired 
    private StoreRepository storeRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/all-store")
	public @ResponseBody Iterable<Store> getAllStores() {
		return storeRepository.findAll();
    }

    @RequestMapping("/all-user")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
    }
    

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}