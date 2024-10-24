package com.nhnacademy.jdbc.student.repository.impl;

import com.nhnacademy.jdbc.student.domain.Student;
import com.nhnacademy.jdbc.student.repository.StudentRepository;

import java.util.Optional;

public class PreparedStatementStudentRepository implements StudentRepository {
    @Override
    public int save(Student student) {
        return 0;
    }

    @Override
    public Optional<Student> findById(String id) {
        return Optional.empty();
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
