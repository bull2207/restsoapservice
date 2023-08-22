package com.in28minutes.springboot.soap.web.services.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.students.CreateStudentDetailsRequest;
import com.in28minutes.students.CreateStudentDetailsResponse;
import com.in28minutes.students.DeleteStudentDetailsRequest;
import com.in28minutes.students.DeleteStudentDetailsResponse;
import com.in28minutes.students.GetStudentDetailsRequest;
import com.in28minutes.students.GetStudentDetailsResponse;

@RestController
public class StudentController {
	
	@Autowired
	Studentservice studentservice;
	
	@GetMapping("/getStudents")
	public GetStudentDetailsResponse getStudent(@RequestBody GetStudentDetailsRequest request){
		return studentservice.getStudent(request);
	}
	
	@DeleteMapping("/getStudents")
	public DeleteStudentDetailsResponse deleteStudent(@RequestBody DeleteStudentDetailsRequest request){
		return studentservice.deleteStudent(request);
	}
	
	@PostMapping("/getStudents")
	public CreateStudentDetailsResponse createStudent(@RequestBody CreateStudentDetailsRequest request){
		return studentservice.createStudent(request);
	}
}
