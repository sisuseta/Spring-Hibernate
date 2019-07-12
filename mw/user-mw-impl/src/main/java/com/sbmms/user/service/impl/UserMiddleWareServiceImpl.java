/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.user.service.impl;

import com.sb.mms.mw.DACException;
import com.sb.mms.mw.MWException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.Response;
import com.sbmms.user.dac.UserDataService;
import com.sbmms.user.service.UserMiddleWareService;
import com.sbmms.user.util.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author TP00455540
 */
@Service("userMiddleWareService")
public class UserMiddleWareServiceImpl implements UserMiddleWareService{

    public UserMiddleWareServiceImpl(){
    }
    @Autowired
    UserDataService userDataService;

    @Override
    public Response findByUserName(Request req) throws MWException,DACException{
        Response response = new Response();
        try{
            if(req.get(UserParam.USERNAME.name()) == null){
               throw new MWException("User name not valid");
            }            
            response = userDataService.findByUserName(req);
        }catch(DACException e){
            throw e;
        }catch(Exception e){
            throw new MWException("MW:Error while find user by user name"+e.getMessage());
        }
        return response;
    }
    
}
