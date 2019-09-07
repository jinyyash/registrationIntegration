package com.hsm.tcpServer.repository;

import com.hsm.tcpServer.models.Student;

public interface StudentRepository {
    int save(Student student);
}
