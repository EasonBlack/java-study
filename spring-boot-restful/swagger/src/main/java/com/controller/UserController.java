
package com.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;

import com.service.Helper;



@Api(value = "user-api", description = "About User", position = 5)
@RestController
@RequestMapping("/user")
public class UserController {

    private Helper h = new Helper();

    @ApiOperation(value="get users", notes="get users list")
    @RequestMapping(value={""}, method= RequestMethod.GET)
    public String getUser() {
        return "User";
    }

    @ApiOperation(value="get user detail", notes="get users detail")
    @RequestMapping(value={"/detail"}, method= RequestMethod.GET)
    public String getUserDetail() {
       
        return h.getTest();
    }
}