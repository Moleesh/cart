package com.mindtree.cart.controller;

import com.mindtree.cart.entity.User;
import com.mindtree.cart.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private
    userService userService;

    @RequestMapping(value = "/getWeight")
    public User getUser(@RequestParam("user") String userName) {
        return userService.getUser(userName);
    }

}
