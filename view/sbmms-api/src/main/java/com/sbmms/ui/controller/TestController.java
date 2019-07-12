/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.ui.controller;

import com.sb.mms.mw.DACException;
import com.sb.mms.mw.MWException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.ViewResponse;
import com.sbmms.mw.util.StringIdentifier;
import com.sbmms.user.service.UserMiddleWareService;
import com.sbmms.user.util.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BK Tamilmani
 */
@RequestMapping("v1/Test")
@RestController
public class TestController {
    @Autowired
    UserMiddleWareService userMiddleWareService;
    @RequestMapping(path="/search/{userName}")
    @ResponseBody
    public ViewResponse testDacData(){
	//@RequestParam(value = "date", required = false)
        ViewResponse response = new ViewResponse();
        try {                    
         Request req =new Request();
         req.add(UserParam.USERNAME.name(), new StringIdentifier(""));
         response = new ViewResponse(UserParam.USER.name(),userMiddleWareService.findByUserName(req));
        } catch (MWException ex) {
           response.addMWError(ex.getMessage());
        } catch (DACException ex) {
            response.addDACError(ex.getMessage());
        } catch (Exception ex) {
           response.addPresentationError(ex.getMessage());
        }
     return response;
    }
}
