/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.test.dao;

import javax.sql.DataSource;
import org.dbunit.database.DatabaseDataSourceConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author TP00455540
 */
@ContextConfiguration("/test-dac-core-context.xml")
public abstract class EntityDaoImplTest extends AbstractTransactionalTestNGSpringContextTests{
        @Autowired
    DataSource dataSource;
 
    @BeforeMethod
    public void setUp() throws Exception {
        IDatabaseConnection dbConn = new DatabaseDataSourceConnection(
                dataSource);
        DatabaseOperation.CLEAN_INSERT.execute(dbConn, getDataSet());
    }
     
    protected abstract IDataSet getDataSet() throws Exception;
}
