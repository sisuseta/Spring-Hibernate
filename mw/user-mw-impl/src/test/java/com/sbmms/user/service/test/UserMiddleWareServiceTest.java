/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.user.service.test;

import com.sb.mms.mw.DACException;
import com.sb.mms.mw.MWException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.Response;
import com.sbmms.mw.util.StringIdentifier;
import com.sbmms.user.dac.UserDataService;
import com.sbmms.user.service.impl.UserMiddleWareServiceImpl;
import com.sbmms.user.util.UserParam;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

/**
 *
 * @author TP00455540
 */
public class UserMiddleWareServiceTest {
    @Mock
    UserDataService userDataService;
    
    @InjectMocks
    UserMiddleWareServiceImpl userMiddleWareService;
    

    Request req;
    
    @BeforeClass
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    public void clearmock(){
        reset(userDataService);
        req = new Request();
    }
    
    @Test
    public void testFindUserByUserNameSuccess() throws DACException, MWException{
        
        clearmock();
     /**Positive testing*/
        req.add(UserParam.USERNAME.name(), new StringIdentifier("test1"));
        when(userDataService.findByUserName(req)).thenReturn(new Response());
        Response res = userMiddleWareService.findByUserName(req);
        Assert.assertEquals(res.SUCCESS(), true);  
        
    }
    
    @Test(expectedExceptions= MWException.class)
    public void testFindUserByUserNameInvalidInput() throws DACException, MWException{
        clearmock();
    /**Invalid Input*/
        when(userMiddleWareService.findByUserName(req));
    }
    
    @Test(expectedExceptions= DACException.class)
    public void testFindUserByUserNameDACException() throws DACException, MWException{
        clearmock();
      /**Run time Exception*/
        req.add(UserParam.USERNAME.name(), new StringIdentifier("test"));
        when(userDataService.findByUserName(req)).thenThrow(new DACException());
        userMiddleWareService.findByUserName(req);
    }

}
