package com.example.springsecurity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subj {
    @Id
    private Long subj_id;

    private String subj1;
    private String subj2;
    private String subj3;
    private String subj4;
    private String subj5;

    public void setId(Long subj_id) {
        this.subj_id = subj_id;
    }

    public Long getId() {
        return subj_id;
    }

    public String getSubj1() {
        return subj1;
    }

    public String getSubj2() {
        return subj2;
    }

    public String getSubj3() {
        return subj3;
    }

    public String getSubj4() {
        return subj4;
    }

    public String getSubj5() {
        return subj5;
    }

    public void setSubj1(String subj1) {
        this.subj1 = subj1;
    }

    public void setSubj2(String subj2) {
        this.subj2 = subj2;
    }

    public void setSubj3(String subj3) {
        this.subj3 = subj3;
    }

    public void setSubj4(String subj4) {
        this.subj4 = subj4;
    }

    public void setSubj5(String subj5) {
        this.subj5 = subj5;
    }
}
