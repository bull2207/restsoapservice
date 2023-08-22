package com.soap.soapws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class StudentConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller= new  Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.soap.soapws.wsdl");
		return marshaller;
	}

}
