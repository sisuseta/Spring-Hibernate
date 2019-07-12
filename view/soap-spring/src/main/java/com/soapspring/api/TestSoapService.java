/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapspring.api;

import com.soapspring.model.TestSoapServiceRequest;
import com.soapspring.model.TestSoapServiceResponse;




/**
 *
 * @author TP00455540
 */
public interface TestSoapService {
    public TestSoapServiceResponse getTestResult(TestSoapServiceRequest in);
}
