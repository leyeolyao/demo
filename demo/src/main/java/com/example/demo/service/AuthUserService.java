package com.example.demo.service;

import com.example.demo.entity.AuthUserEntity;
import com.example.demo.repository.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthUserService {
    @Autowired
    private AuthUserRepository authUserRepository;

    public List<AuthUserEntity> findAll(){
        return authUserRepository.findAll();
    }

    public AuthUserEntity findById(Long id){
        Optional<AuthUserEntity> optionalAuthUserEntity = authUserRepository.findById(id);
        if(optionalAuthUserEntity.isPresent()){
            return optionalAuthUserEntity.get();
        }
        else {
            return null;
        }
    }


}
