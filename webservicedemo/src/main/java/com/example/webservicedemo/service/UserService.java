package com.example.webservicedemo.service;

import com.example.webservicedemo.model.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public interface UserService  {
    @WebMethod
    String getName(@WebParam(name = "userId") String userId);

    @WebMethod
    User getUser(String userId);

    @WebMethod
    ArrayList<User> getAllUser();

}
