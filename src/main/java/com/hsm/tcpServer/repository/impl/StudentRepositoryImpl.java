package com.hsm.tcpServer.repository.impl;

import com.hsm.tcpServer.models.Student;
import com.hsm.tcpServer.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    //to use spring configured datasource and jdbc template
    // To use it, just @Autowired
    @Autowired

    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Student student) {
        return jdbcTemplate.update("insert into student values(?,?,?,?)", student.getNic(), student.getName(),
                student.getAddress(), student.getTel());    }
}
