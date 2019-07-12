/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.batch.dac.impl;

import com.sb.mms.mw.DACException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.Response;
import com.sbmms.batch.dac.BatchDataService;

import org.springframework.stereotype.Service;


/**
 *
 * @author TP00455540
 */
@Service
public class BatchDataServiceImpl implements BatchDataService {

    
    public Response executeBatchFile(Request req) throws DACException{
        Response response = new Response();
        try{
          
        }catch(Exception e){
               throw new DACException("Error while find user by user name :"+e.getMessage());
        }
        return response;
    }

}
