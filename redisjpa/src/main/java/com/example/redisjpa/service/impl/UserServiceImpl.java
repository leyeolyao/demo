package com.example.redisjpa.service.impl;

import com.example.redisjpa.dao.UserDao;
import com.example.redisjpa.model.User;
import com.example.redisjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Cacheable(value="userCache")
    @Override
    public List<User> getAllUser() {
        System.out.println("first time query or after reflush");
        return userDao.findAll();
    }

    //allEntries 清空缓存所有属性 确保更新后缓存刷新
    @CacheEvict(value="userCache", allEntries=true)
    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    //allEntries 清空缓存所有属性 确保更新后缓存刷新
    @CacheEvict(value="userCache", allEntries=true)
    @Override
    public boolean deleteById(Long id) {
        Optional<User> user = userDao.findById(id);
        if(user.isPresent()){
            userDao.deleteById(id);
            return true;
        }
        return false;
    }
}
