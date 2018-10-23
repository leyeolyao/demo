package com.example.dao;

import com.example.dao.domain.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<UserDO, Long> {
}
