package com.kapil.sb.service;

import java.util.List;

import com.kapil.sb.model.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student saveStudent(Student student);

	Student findStudent(Integer id);

}
