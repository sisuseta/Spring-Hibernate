/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springconsume;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 *
 * @author TP00455540
 */
@Configuration
public class Config {
     @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.testsoapproject");
        return marshaller;
    }
     
     @Bean
	public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
		SoapConnector client = new SoapConnector();
		client.setDefaultUri("http://localhost:8080/soap-spring/getTestResults");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
