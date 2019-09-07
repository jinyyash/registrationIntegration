package com.hsm.tcpServer.service;

import com.hsm.tcpServer.models.Student;

import java.io.IOException;
import java.sql.SQLException;

public interface StudentService {

    byte[] processMessage(byte[] message) throws IOException, SQLException, ClassNotFoundException;
    int save(Student student) throws SQLException, ClassNotFoundException, IOException;


}
