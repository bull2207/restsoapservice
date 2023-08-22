package com.in28minutes.springboot.soap.web.services.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.in28minutes.students.CreateStudentDetailsRequest;
import com.in28minutes.students.CreateStudentDetailsResponse;
import com.in28minutes.students.DeleteStudentDetailsRequest;
import com.in28minutes.students.DeleteStudentDetailsResponse;
import com.in28minutes.students.GetStudentDetailsRequest;
import com.in28minutes.students.GetStudentDetailsResponse;

@Service
public class Studentservice {
	
	@Autowired
	Jaxb2Marshaller marshaller;

	WebServiceTemplate template;
	
	public GetStudentDetailsResponse getStudent(GetStudentDetailsRequest request) {
		
		template = new WebServiceTemplate(marshaller);
		GetStudentDetailsResponse response = (GetStudentDetailsResponse) template.marshalSendAndReceive("http://localhost:8080/ws/",request);
		return response;
		}
	public DeleteStudentDetailsResponse deleteStudent(DeleteStudentDetailsRequest request) {
		
		template = new WebServiceTemplate(marshaller);
		DeleteStudentDetailsResponse response = (DeleteStudentDetailsResponse) template.marshalSendAndReceive("http://localhost:8080/ws/",request);
		return response;
		}
	public CreateStudentDetailsResponse createStudent(CreateStudentDetailsRequest request) {
		
		template = new WebServiceTemplate(marshaller);
		CreateStudentDetailsResponse response = (CreateStudentDetailsResponse) template.marshalSendAndReceive("http://localhost:8080/ws/",request);
		return response;
		}
}
