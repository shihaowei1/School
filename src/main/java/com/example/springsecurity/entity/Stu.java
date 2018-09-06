package com.example.springsecurity.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stu {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stu_id;
    private String stu_name;
    private Long age;
    private Long score;
    private String subj;

    public void setStu_id(Long stu_id) {
        this.stu_id = stu_id;
    }

    public Long getStu_id() {
        return stu_id;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getAge() {
        return age;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getScore() {
        return score;
    }

    public void setSubj(String subj) {
        this.subj = subj;
    }

    public String getSubj() {
        return subj;
    }
}
