package com.in28minutes.springboot.soap.web.services.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.soap.web.services.example.student.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
		 
	//Student findByID(int id);
	
}
