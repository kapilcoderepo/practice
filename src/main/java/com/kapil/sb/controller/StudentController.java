package com.kapil.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kapil.sb.model.Student;
import com.kapil.sb.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/get-students")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	@GetMapping("/student/{id}")
	public Student findStudent(@PathVariable Integer id) {
		return studentService.findStudent(id);
	}
}
