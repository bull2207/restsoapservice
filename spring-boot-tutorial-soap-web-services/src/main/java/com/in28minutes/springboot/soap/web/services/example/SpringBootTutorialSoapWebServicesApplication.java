package com.in28minutes.springboot.soap.web.services.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.in28minutes.springboot.soap.web.services.example.Studentservice;

import com.in28minutes.students.GetStudentDetailsRequest;
import com.in28minutes.students.GetStudentDetailsResponse;

@SpringBootApplication
@Configuration
@ComponentScan
//@RestController
@EnableAutoConfiguration
public class SpringBootTutorialSoapWebServicesApplication {
	/*
	 * @Autowired Studentservice studentservice;
	 * 
	 * @PostMapping("/students") public GetStudentDetailsResponse
	 * getStudent(@RequestBody GetStudentDetailsRequest request){ return
	 * studentservice.getStudent(request); }
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialSoapWebServicesApplication.class, args);
	}
}
