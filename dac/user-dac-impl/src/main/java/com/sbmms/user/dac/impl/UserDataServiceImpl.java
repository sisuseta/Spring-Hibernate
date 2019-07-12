/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.user.dac.impl;

import com.sb.mms.mw.DACException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.Response;
import com.sbmms.mw.util.StringIdentifier;
import com.sbmms.user.dac.UserDataService;
import com.sbmms.user.dac.dao.UserDAO;
import com.sbmms.user.util.UserParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author TP00455540
 */
@Service
public class UserDataServiceImpl implements UserDataService {
    @Autowired
    private UserDAO userDAO;
    
    @Override
    public Response findByUserName(Request req) throws DACException{
        Response response = new Response();
        try{
            if(req.get(UserParam.USERNAME.name()) == null){
               throw new DACException("User name not valid");
            }            
           // response.add(UserParam.USER.name(), userDAO.findByUserName(StringIdentifier.valueOf(req.get(UserParam.USERNAME.name())));
        }catch(Exception e){
               throw new DACException("Error while find user by user name :"+e.getMessage());
        }
        return response;
    }

}
