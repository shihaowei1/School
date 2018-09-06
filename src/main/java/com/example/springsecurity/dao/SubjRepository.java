package com.example.springsecurity.dao;

import com.example.springsecurity.entity.Subj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubjRepository extends JpaRepository<Subj, Long> {
    List<Subj> findAll();

    @Query("select subj from Subj subj where subj.id=?1")
    Subj findBySubj_id(Long subj_id);
}
