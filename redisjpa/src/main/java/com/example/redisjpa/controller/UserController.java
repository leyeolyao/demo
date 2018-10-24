package com.example.redisjpa.controller;

import com.example.redisjpa.model.User;
import com.example.redisjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/all")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @ResponseBody
    @RequestMapping("/save")
    public User saveUser(User user){
        return userService.save(user);
    }

    @RequestMapping("/delete/{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        userService.deleteById(id);
    }

}
