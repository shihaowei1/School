package com.example.springsecurity.dao;

import com.example.springsecurity.entity.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StuRepository extends JpaRepository<Stu, Long> {

    List<Stu> findAll();

    @Query("select stu from Stu stu where stu.stu_id=?1")
    Stu findByStu_id(Long StuId);

    @Query("select stu from Stu stu where stu.stu_name=?1")
    Stu findByStu_name(String StuName);
}
