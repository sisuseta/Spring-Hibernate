/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.ui.controller;

import com.sb.mms.mw.ViewResponse;
import com.sbmms.ui.utils.DummyDataUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BK Tamilmani
 */
@RequestMapping("v1/events")
@RestController
public class EventController {
     @RequestMapping(path="/all")
    @ResponseBody
    public ViewResponse getAll(){
        ViewResponse response =new ViewResponse();
       response.setList(DummyDataUtils.getInstance().getEvents());
        return response;
    }
}
