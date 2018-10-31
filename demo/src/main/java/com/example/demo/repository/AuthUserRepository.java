package com.example.demo.repository;

import com.example.demo.entity.AuthUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUserEntity, Long> {
}
