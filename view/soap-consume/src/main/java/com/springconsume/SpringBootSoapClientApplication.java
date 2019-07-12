/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springconsume;

import com.testsoapproject.TestSoapServiceRequest;
import com.testsoapproject.TestSoapServiceResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author TP00455540
 */
@SpringBootApplication
public class SpringBootSoapClientApplication {
     public static void main(String[] args) {
        SpringApplication.run(SpringBootSoapClientApplication.class, args);
    }
     
     @Bean
     CommandLineRunner callSoap(SoapConnector soapConnector){
     return args -> {
			String refno = "";//Default Name
                        String name = "";
			if(args.length>0){
				refno = args[0];
                                name = args[1];
			}
                        TestSoapServiceRequest req= new TestSoapServiceRequest();
                        req.setReferenceNo(refno);
                        req.setUserName(name);
                        TestSoapServiceResponse res= (TestSoapServiceResponse) soapConnector.callWebService("http://localhost:8080/soap-spring/getTestResults", req);
                        System.out.println("Response : "+res.getResult());
     };
     }
}
