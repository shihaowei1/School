package com.example.springsecurity.service.impl;

import com.example.springsecurity.dao.StuRepository;
import com.example.springsecurity.dao.SubjRepository;
import com.example.springsecurity.entity.Stu;
import com.example.springsecurity.entity.Subj;
import com.example.springsecurity.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    StuRepository stuRepository;

    @Autowired
    SubjRepository subjRepository;

    @Override
    @Transactional
    public List<Stu> AllData() {
        return stuRepository.findAll();
    }

    @Override
    @Transactional
    public Stu SearchStu(Long StuId) {
        return stuRepository.findByStu_id(StuId);
    }

    @Override
    @Transactional
    public String AddStu(Long stu_id, String stu_name, Long stu_age, Long stu_score) {
        Stu stu = stuRepository.findByStu_id(stu_id);
        if (stu != null){
            return "false";
        }

        if (stu_id != null && stu_name.length() > 0 && stu_age != null) {
            Stu student = new Stu();
            student.setStu_id(stu_id);
            student.setStu_name(stu_name);
            student.setAge(stu_age);
            student.setScore(stu_score);
            stuRepository.save(student);
            return "true";
        }
        return "false";
    }

    @Override
    @Transactional
    public String ChangeStu(Long stu_id, String stu_name, Long stu_age, Long stu_score, String stu_subj) {
        if (stu_id == null) {
            return "false";
        }
        Stu student = stuRepository.findByStu_id(stu_id);

        if (stu_name.length() > 0) {
            student.setStu_name(stu_name);
        }
        if (stu_age != null) {
            student.setAge(stu_age);
        }
        if (stu_score != null) {
            student.setScore(stu_score);
        }
        if (stu_subj != null) {
            student.setSubj(stu_subj);
        }
        stuRepository.save(student);
        return "true";
    }

    @Override
    @Transactional
    public String SetSubj(String subj1, String subj2, String subj3, String subj4, String subj5) {
        Subj subj = subjRepository.findBySubj_id(Long.valueOf(0));
        subj.setSubj1(subj1);
        subj.setSubj2(subj2);
        subj.setSubj3(subj3);
        subj.setSubj4(subj4);
        subj.setSubj5(subj5);

        subjRepository.save(subj);
        return "true";
    }
}
