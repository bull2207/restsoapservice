package com.in28minutes.springboot.soap.web.services.example.student;

import com.in28minutes.springboot.soap.web.services.example.StudentRepo;
import com.in28minutes.students.CreateStudentDetailsRequest;
import com.in28minutes.students.CreateStudentDetailsResponse;
import com.in28minutes.students.DeleteStudentDetailsRequest;
import com.in28minutes.students.DeleteStudentDetailsResponse;
import com.in28minutes.students.GetStudentDetailsRequest;
import com.in28minutes.students.GetStudentDetailsResponse;
import com.in28minutes.students.StudentCreated;
import com.in28minutes.students.StudentDeleted;
import com.in28minutes.students.StudentDetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentDetailsEndpoint {
	@Autowired
	StudentRepo studentRepo;

	@PayloadRoot(namespace = "http://in28minutes.com/students", localPart = "GetStudentDetailsRequest")
	@ResponsePayload
	public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request) {
		GetStudentDetailsResponse response = new GetStudentDetailsResponse();

		StudentDetails studentDetails = new StudentDetails();
		Optional<Student> studentop = studentRepo.findById(request.getId());

		if (studentop.isPresent()) {
			Student student = studentop.get();

			studentDetails.setId(student.getId());
			studentDetails.setName(student.getName());
			studentDetails.setPassportNumber(student.getPassportNumber());
		} else {
			studentDetails.setId(-1);
			studentDetails.setName("Not in DB");
			studentDetails.setPassportNumber("Not in DB");
		}
		response.setStudentDetails(studentDetails);

		return response;
	}
	
	@PayloadRoot(namespace = "http://in28minutes.com/students", localPart = "DeleteStudentDetailsRequest")
	@ResponsePayload
	public DeleteStudentDetailsResponse deleteRequest(@RequestPayload DeleteStudentDetailsRequest request) {
		DeleteStudentDetailsResponse response = new DeleteStudentDetailsResponse();

		StudentDeleted studentDeleted = new StudentDeleted();
		Optional<Student> studentop = studentRepo.findById(request.getId());

		if (studentop.isPresent()) {
			Student student = studentop.get();

			studentDeleted.setId(student.getId());
			studentDeleted.setName(student.getName());
			studentDeleted.setPassportNumber(student.getPassportNumber());
			studentDeleted.setStatus("Deleted");
			studentRepo.deleteById(request.getId());
		} else {
			studentDeleted.setId(-1);
			studentDeleted.setName("Not in DB");
			studentDeleted.setPassportNumber("Not in DB");
			studentDeleted.setStatus("Delete not performed. Student not in DB");
		}
		response.setStudentDeleted(studentDeleted);

		return response;
	}

	@PayloadRoot(namespace = "http://in28minutes.com/students", localPart = "CreateStudentDetailsRequest")
	@ResponsePayload
	public CreateStudentDetailsResponse createRequest(@RequestPayload CreateStudentDetailsRequest request) {
		CreateStudentDetailsResponse response = new CreateStudentDetailsResponse();

		StudentCreated studentCreated = new StudentCreated();
/*		Optional<Student> studentop = studentRepo.findById(request.getId());

		if (studentop.isPresent()) {
			Student student = studentop.get();

			studentDetails.setId(student.getId());
			studentDetails.setName(student.getName());
			studentDetails.setPassportNumber(student.getPassportNumber());
		} else {*/
			Student S = new Student(request.getId(),request.getName(),request.getPassportNumber());
			studentCreated.setId(request.getId());
			studentCreated.setName(request.getName());
			studentCreated.setPassportNumber(request.getPassportNumber());
			studentRepo.save(S);
		//}
		//response.setStudentDetails(studentDetails);
		response.setStudentCreated(studentCreated);

		return response;
	}


}