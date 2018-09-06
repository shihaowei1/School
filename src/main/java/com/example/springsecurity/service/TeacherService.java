package com.example.springsecurity.service;

import com.example.springsecurity.entity.Stu;

import java.util.List;

public interface TeacherService {
    List<Stu> AllData();

    Stu SearchStu(Long StuId);

    String AddStu(Long stu_id, String stu_name, Long stu_age, Long stu_score);

    String ChangeStu(Long stu_id, String stu_name, Long stu_age, Long stu_score, String stu_subj);

    String SetSubj(String subj1, String subj2, String subj3, String subj4, String subj5);
}
