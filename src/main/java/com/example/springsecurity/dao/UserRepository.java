package com.example.springsecurity.dao;

import com.example.springsecurity.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SysUser, Long>{
    SysUser findByUsername(String username);
}
