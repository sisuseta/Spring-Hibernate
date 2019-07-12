/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.ui.controller.test;

import com.sbmms.ui.utils.DummyDataUtils;
import org.testng.annotations.Test;

/**
 *
 * @author BK Tamilmani
 */
public class TestDummyData {
    @Test
    public void testAddress(){
         DummyDataUtils.getInstance().getAdderss();
    }
    
        @Test
    public void testEvents(){
         DummyDataUtils.getInstance().getEvents();
    }
        
                @Test
    public void testMembers(){
         DummyDataUtils.getInstance().getMembers();
    }
                
                
}
