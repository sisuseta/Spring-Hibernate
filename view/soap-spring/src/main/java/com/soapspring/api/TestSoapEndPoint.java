/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapspring.api;

import com.soapspring.model.TestSoapServiceRequest;
import com.soapspring.model.TestSoapServiceResponse;
import org.jdom.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author TP00455540
 */
@Endpoint
public class TestSoapEndPoint {
    private static final String NAMESPACE_URI = "http://localsetup.com/tsw/schemas";
    private TestSoapService testSoapService;
    
    @Autowired
    public TestSoapEndPoint(TestSoapService testSoapService) throws JDOMException {
        this.testSoapService = testSoapService;
     }
    
    @PayloadRoot(namespace=NAMESPACE_URI,localPart="testSoapServiceRequest")
    @ResponsePayload
    public TestSoapServiceResponse handleTestService(@RequestPayload TestSoapServiceRequest testSoapServiceRequest ) throws Exception{
        TestSoapServiceResponse testSoapServiceResponse = testSoapService.getTestResult(testSoapServiceRequest);
        return testSoapServiceResponse;
    }
}
