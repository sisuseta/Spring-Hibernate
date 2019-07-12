/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapspring.api;

import com.soapspring.model.TestSoapServiceRequest;
import com.soapspring.model.TestSoapServiceResponse;
import org.springframework.stereotype.Service;




/**
 *
 * @author TP00455540
 */
@Service
public class TestSoapServiceImpl implements TestSoapService{

    @Override
    public TestSoapServiceResponse getTestResult(TestSoapServiceRequest in) {
       TestSoapServiceResponse out=new TestSoapServiceResponse();
       out.setResult("Hi "+in.getUserName()+", You send request with reference no"+in.getReferenceNo());
       return out;
    }
    
}
