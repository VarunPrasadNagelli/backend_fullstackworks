package com.varunprasadnagelli.studentsystem.service;

import com.varunprasadnagelli.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getStudents();
}
