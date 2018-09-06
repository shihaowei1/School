package com.example.springsecurity.service;

import com.example.springsecurity.entity.SysUser;

public interface SysUserService {


    SysUser findByUsername(String username);


    SysUser save(SysUser user);
}
