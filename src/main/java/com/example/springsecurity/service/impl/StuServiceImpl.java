package com.example.springsecurity.service.impl;

import com.example.springsecurity.dao.StuRepository;
import com.example.springsecurity.dao.SubjRepository;
import com.example.springsecurity.entity.Stu;
import com.example.springsecurity.entity.Subj;
import com.example.springsecurity.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    StuRepository stuRepository;

    @Autowired
    SubjRepository subjRepository;

    @Override
    @Transactional
    public Stu MyInfo(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().
                getAuthentication().getPrincipal();
        String username = userDetails.getUsername();
        Stu stu = stuRepository.findByStu_name(username);
        return stu;
    }

    @Override
    @Transactional
    public List<Subj> AllSubj(){
        return subjRepository.findAll();
    }

    @Override
    @Transactional
    /************ There is something bad *************/
    /************* 没有验证输入的所选科目是否在可选列表里 *********/
    public String ChosSubj(String ChosSubj){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().
                getAuthentication().getPrincipal();
        String username = userDetails.getUsername();
        Stu stu = stuRepository.findByStu_name(username);
        if (ChosSubj.length() > 0){
            stu.setSubj(ChosSubj);
        }
        stuRepository.save(stu);
        return "true";
    }
}
