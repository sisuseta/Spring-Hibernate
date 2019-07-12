/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springconsume;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 *
 * @author TP00455540
 */
public class SoapConnector extends WebServiceGatewaySupport {
    
     public Object callWebService(String url, Object request){
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
}
