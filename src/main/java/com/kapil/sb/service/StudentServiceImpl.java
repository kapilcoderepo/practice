package com.kapil.sb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kapil.sb.model.Student;
import com.kapil.sb.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Student findStudent(Integer id) {
		Optional<Student> s= repo.findById(id);
		if(s.isPresent()) {
			return s.get();
		}
		return null;
	}

}
