/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.uset.dac.impl;


import com.sb.mms.mw.DACException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.Response;
import com.sbmms.mw.util.StringIdentifier;
import com.sbmms.test.dao.EntityDaoImplTest;
import com.sbmms.user.dac.UserDataService;
import com.sbmms.user.dac.dao.UserDAO;
import com.sbmms.user.util.UserParam;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 *
 * @author TP00455540
 */
public class UserDataServiceTest extends EntityDaoImplTest {
    @Autowired
    UserDataService userDataServiceImp;
    
        @Autowired
    UserDAO userDAO;
        
    @Override
    protected IDataSet getDataSet() throws Exception{
        IDataSet dataSet = new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream("User.xml"));
        return dataSet;
    }
    
     @Test
    public void findByUserName() throws DACException{
         Request req =new Request();
         req.add(UserParam.USERNAME.name(), new StringIdentifier("SAMY"));
         Response res = userDataServiceImp.findByUserName(req);
        Assert.assertNotNull(res.get(UserParam.USER.name()));

    }
}
