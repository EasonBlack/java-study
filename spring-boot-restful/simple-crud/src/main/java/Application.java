package com.eason;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eason.User;
import com.eason.UserRepository;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping(value="/user/{userName}/{userNum}")  
    @ResponseBody
    public String saveUser(@PathVariable String userName, @PathVariable Integer userNum) {
        userRepository.save(new User(userName, userNum));   //new User(userName, userNum)
        return "success";
    }

    @RequestMapping(value="/user/delete/{userId}")  
    public String deleteUser(@PathVariable Long userId) {
        User user = userRepository.findOne(userId);
        userRepository.delete(user);
        return "Delete Success";
    }

    @RequestMapping(value="/user/{userId}")  
    @ResponseBody
    public User getUserById(@PathVariable Long userId, @PathVariable String userName, @PathVariable Integer userNum) {
        User user = userRepository.findOne(userId);
        return user;
    }

    @RequestMapping(value="/user/{userId}/{userName}/{userNum}")  
    public String updateUserById(@PathVariable Long userId, @PathVariable String userName, @PathVariable Integer userNum) {
        User user = userRepository.findOne(userId);
        user.setName(userName);
        user.setNum(userNum);
        userRepository.save(user);
        return "Update Successful";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}