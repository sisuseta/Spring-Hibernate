/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.ui.controller.test;

import com.sb.mms.mw.DACException;
import com.sb.mms.mw.MWException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.Response;
import com.sb.mms.mw.ViewResponse;
import com.sbmms.mw.util.StringIdentifier;
import com.sbmms.ui.controller.TestController;
import com.sbmms.user.service.UserMiddleWareService;
import com.sbmms.user.util.User;
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
public class TestControllerTest {
    @Mock
    UserMiddleWareService userMiddleWareService;
    @InjectMocks
    TestController testController;
    @Mock
    Request req;
    @Mock
    User user;
    @Mock
    Response res;
        
    @BeforeClass
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        res = new Response();
        res.add(UserParam.USER.name(),user);
    }
    
    public void clearmock(){
        reset(userMiddleWareService);
    }
     
     @Test
    public void testDacDataSuccess() throws MWException, DACException{
         clearmock();
    /**Positive testing*/
        when(req.get(UserParam.USERNAME.name())).thenReturn(new StringIdentifier(anyString()));
        when(userMiddleWareService.findByUserName(req)).thenReturn(res);
        ViewResponse res = testController.testDacData();
        Assert.assertEquals(res.isSuccess(), true);
        Assert.assertNotNull(res.getData());    
    }
      @Test
    public void testDacDataMwException() throws MWException, DACException{
          clearmock();
    /**Positive testing*/
        when(req.get(UserParam.USERNAME.name())).thenReturn(new StringIdentifier(anyString()));
        
        when(userMiddleWareService.findByUserName(req)).thenThrow(new MWException(anyString()));
        
        ViewResponse res = testController.testDacData();
        Assert.assertEquals(res.isSuccess(), false);
        Assert.assertNotNull(res.getErrors());

    }
       
    @Test
    public void testDacDataDACException() throws MWException, DACException{
        clearmock();
    /**Positive testing*/
        when(req.get(UserParam.USERNAME.name())).thenReturn(new StringIdentifier(anyString()));
        when(userMiddleWareService.findByUserName(req)).thenThrow(new DACException(anyString()));
        ViewResponse res = testController.testDacData();
        Assert.assertEquals(res.isSuccess(), false);
        Assert.assertNotNull(res.getErrors());
    }
    
    @Test
    public void testDacDataException() throws MWException, DACException{
        clearmock();
    /**Positive testing*/
        when(req.get(UserParam.USERNAME.name())).thenReturn(new StringIdentifier(anyString()));
        when(userMiddleWareService.findByUserName(req)).thenThrow(new NullPointerException(anyString()));
        ViewResponse res = testController.testDacData();
        Assert.assertEquals(res.isSuccess(), false);
        Assert.assertNotNull(res.getErrors());
    }
   
   
}
