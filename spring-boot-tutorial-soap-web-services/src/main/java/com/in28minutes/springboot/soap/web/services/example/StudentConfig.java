package com.in28minutes.springboot.soap.web.services.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class StudentConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller= new  Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.in28minutes.students");
		return marshaller;
	}

}
