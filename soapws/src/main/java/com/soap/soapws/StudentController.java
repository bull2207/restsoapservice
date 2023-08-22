package com.soap.soapws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soap.soapws.wsdl.CreateStudentDetailsRequest;
import com.soap.soapws.wsdl.CreateStudentDetailsResponse;
import com.soap.soapws.wsdl.DeleteStudentDetailsRequest;
import com.soap.soapws.wsdl.DeleteStudentDetailsResponse;
import com.soap.soapws.wsdl.GetStudentDetailsRequest;
import com.soap.soapws.wsdl.GetStudentDetailsResponse;


@RestController
public class StudentController {
	
	@Autowired
	Studentservice studentservice;
	
	@GetMapping("/getGradleStudents")
	public GetStudentDetailsResponse getStudent(@RequestBody GetStudentDetailsRequest request){
		return studentservice.getStudent(request);
	}
	
	@DeleteMapping("/getGradleStudents")
	public DeleteStudentDetailsResponse deleteStudent(@RequestBody DeleteStudentDetailsRequest request){
		return studentservice.deleteStudent(request);
	}
	
	@PostMapping("/getGradleStudents")
	public CreateStudentDetailsResponse createStudent(@RequestBody CreateStudentDetailsRequest request){
		return studentservice.createStudent(request);
	}
}
