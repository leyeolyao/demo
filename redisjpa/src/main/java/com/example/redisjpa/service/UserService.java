package com.example.redisjpa.service;

import com.example.redisjpa.model.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 添加或修改用户信息
     * @param user
     */
    User save(User user);

    /**
     * 根据Id删除用户信息
     * @param id
     */
    void deleteById(Long id);
}
