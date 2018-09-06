package com.example.springsecurity.controller;

import com.example.springsecurity.entity.Stu;
import com.example.springsecurity.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TeacherController {

    @Resource
    TeacherService teacherService;

    @RequestMapping(value = "/AllData", method = RequestMethod.POST)
    public List<Stu> AllData(){
        return teacherService.AllData();
    }

    @RequestMapping(value = "/SearchStu", method = RequestMethod.POST)
    public Stu SearchStu(@RequestParam("StuId") Long StuId){
        return teacherService.SearchStu(StuId);
    }

    @RequestMapping(value = "/AddStu", method = RequestMethod.POST)
    public String AddStu(@RequestParam("stu_id") Long stu_id,
                         @RequestParam("stu_name") String stu_name,
                         @RequestParam("stu_age") Long stu_age,
                         @RequestParam("stu_score") Long stu_score){
        return teacherService.AddStu(stu_id, stu_name, stu_age, stu_score);
    }

    @RequestMapping(value = "/ChangeStu", method = RequestMethod.POST)
    public String ChangeStu(@RequestParam("stu_id") Long stu_id,
                         @RequestParam("stu_name") String stu_name,
                         @RequestParam("stu_age") Long stu_age,
                         @RequestParam("stu_score") Long stu_score,
                            @RequestParam("stu_subj") String stu_subj){
        return teacherService.ChangeStu(stu_id, stu_name, stu_age, stu_score, stu_subj);
    }

    @RequestMapping(value = "/SetSubj", method = RequestMethod.POST)
    public String SetSubj(@RequestParam("subj1")String subj1,
                          @RequestParam("subj2")String subj2,
                          @RequestParam("subj3")String subj3,
                          @RequestParam("subj4")String subj4,
                          @RequestParam("subj5")String subj5){
        return teacherService.SetSubj(subj1,subj2,subj3,subj4,subj5);
    }
}
