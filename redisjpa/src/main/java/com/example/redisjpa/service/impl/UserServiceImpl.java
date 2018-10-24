package com.example.redisjpa.service.impl;

import com.example.redisjpa.dao.UserDao;
import com.example.redisjpa.model.User;
import com.example.redisjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Cacheable(value="userCache")
    @Override
    public List<User> getAllUser() {
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
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }
}
