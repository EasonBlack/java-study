package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import com.service.TestService;
import com.entities.User;
import com.entities.UserModal;

@Controller
@RequestMapping(value = "test")
public class TestController {


  	@Autowired
	TestService testservice;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	@ResponseBody
	public String getIndex() {
		return "Hello Test";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody	
	public String update(@RequestBody UserModal user) {	//public String update(@RequestBody User user) 
		return "Hello Update" + user.getName();
	}


	@RequestMapping(value = "/userlist", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<User> getUserList() {
		return testservice.getUserList();
	}

}

