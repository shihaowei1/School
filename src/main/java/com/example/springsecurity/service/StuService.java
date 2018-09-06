package com.example.springsecurity.service;

import com.example.springsecurity.entity.Stu;
import com.example.springsecurity.entity.Subj;

import java.util.List;

public interface StuService {
    Stu MyInfo();

    List<Subj> AllSubj();

    String ChosSubj(String ChosSubj);
}
