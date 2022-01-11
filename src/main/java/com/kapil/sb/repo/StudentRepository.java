package com.kapil.sb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kapil.sb.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
