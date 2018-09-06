package com.example.springsecurity.controller;

import com.example.springsecurity.entity.Stu;
import com.example.springsecurity.entity.Subj;
import com.example.springsecurity.service.StuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {

    @Resource
    StuService stuService;

    @RequestMapping(value = "/MyInfo", method = RequestMethod.POST)
    public Stu MyInfo(){
        return stuService.MyInfo();
    }

    @RequestMapping(value = "/AllSubj", method = RequestMethod.POST)
    public List<Subj> AllSubj(){
        return stuService.AllSubj();
    }

    @RequestMapping(value = "/ChosSubj", method = RequestMethod.POST)
    public String ChosSubj(@RequestParam("ChosSubj") String ChosSubj){
        return stuService.ChosSubj(ChosSubj);
    }
}
