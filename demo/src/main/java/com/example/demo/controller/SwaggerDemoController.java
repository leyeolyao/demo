package com.example.demo.controller;

import com.example.demo.entity.AuthUserEntity;
import com.example.demo.exception.ErrorBody;
import com.example.demo.service.AuthUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


@RestController
@RequestMapping("api")
@Api(value = "swaggerDemoController相关的api", tags = {"swaggerDemoController相关的api"})
public class SwaggerDemoController {
    @Autowired
    private AuthUserService authUserService;

    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "id", value = "用户Id", paramType = "path", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public AuthUserEntity getStudent(@PathVariable Long id) {
        System.out.println("根据ID查询用户信息");
        return authUserService.findById(id);
    }

    @ApiOperation(value = "调用远程用户服务", notes = "调用远程用户服务")
    @GetMapping("/restTemplate/{port}/{id}")
    public AuthUserEntity info(@PathVariable("port") String port, @PathVariable("id") String id) throws IOException {
        System.out.println("restTemplate调用远程服务");

        String apiURL = "http://localhost:" + port + "/user/" + id;
        return restTemplate.getForObject(apiURL, AuthUserEntity.class);
    }

    @ExceptionHandler(RestClientResponseException.class)
    public ErrorBody exceptionHandler(HttpClientErrorException e) throws IOException {
        return new ObjectMapper().readValue(e.getResponseBodyAsString(), ErrorBody.class);
    }




}
