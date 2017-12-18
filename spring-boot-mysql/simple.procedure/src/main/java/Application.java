package com.eason;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.*;
import java.util.List;

import com.eason.User;
import com.eason.UserRepository;



@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/all")
	public @ResponseBody Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @RequestMapping("/all-user")
	public @ResponseBody Iterable<User> getAllUsers() {
        StoredProcedureQuery storedProcedureQuery = this.entityManager.createNamedStoredProcedureQuery("getAllUser");
        // storedProcedureQuery.execute();
        return storedProcedureQuery.getResultList();
    }

    @RequestMapping("/all-user2")
	public @ResponseBody Iterable<User> getAllUsers2() {
        StoredProcedureQuery storedProcedureQuery = this.entityManager.createNamedStoredProcedureQuery("getAllUser2");
        // storedProcedureQuery.execute();
        return storedProcedureQuery.getResultList();
    }


    @RequestMapping("/all-user3")
	public @ResponseBody Iterable<User> getAllUsers3() {
        return userRepository.findAllUsers();
    }

    @RequestMapping("/usercount")
	public @ResponseBody String getUserCount() {
        StoredProcedureQuery storedProcedureQuery = this.entityManager.createNamedStoredProcedureQuery("getUserByName");
        storedProcedureQuery.setParameter("userName", "aa");
        Object o1 = storedProcedureQuery.getOutputParameterValue("userCount");
        return o1.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}