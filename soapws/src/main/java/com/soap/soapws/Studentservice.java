package com.soap.soapws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.soap.soapws.wsdl.CreateStudentDetailsRequest;
import com.soap.soapws.wsdl.CreateStudentDetailsResponse;
import com.soap.soapws.wsdl.DeleteStudentDetailsRequest;
import com.soap.soapws.wsdl.DeleteStudentDetailsResponse;
import com.soap.soapws.wsdl.GetStudentDetailsRequest;
import com.soap.soapws.wsdl.GetStudentDetailsResponse;


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
