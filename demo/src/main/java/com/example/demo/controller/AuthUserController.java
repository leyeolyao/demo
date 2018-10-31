package com.example.demo.controller;

import com.example.demo.entity.AuthUserEntity;
import com.example.demo.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AuthUserController {
    @Autowired
    private AuthUserService authUserService;

    @GetMapping("/all")
    public List<AuthUserEntity> getAllUser(){
        List<AuthUserEntity> authUserEntityList = authUserService.findAll();
        System.out.println("authuserlist is: " + authUserEntityList.size() );

        return authUserEntityList;
    }

    @GetMapping("/{id}")
    public AuthUserEntity getStudent(@PathVariable Long id) {
        System.out.println("AuthUserController 被调用查询用户信息");
        return authUserService.findById(id);
    }
}
