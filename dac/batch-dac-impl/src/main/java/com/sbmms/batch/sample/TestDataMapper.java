/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.batch.sample;

import com.sbmms.batch.dac.model.TestObject;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;


public class TestDataMapper  implements FieldSetMapper {
    private String resource;
   
    @Override
    public Object mapFieldSet(FieldSet fs) throws BindException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
    
    public Object mapFieldSet1(FieldSet fs) {
        System.out.println("Hi ");
        TestObject test = new  TestObject(); 
        test.setId(fs.readInt("id"));
        test.setTitle(fs.readString("title"));
        test.setSubTitle(fs.readString("subTitle"));
        test.setDescription(fs.readString("description"));
        test.setPlace(fs.readString("place"));
        test.setType(fs.readString("type"));
        System.out.println(test.toString());
        return test;
    }
    
    
    	public void setResource(String resource) {
		this.resource = resource;
	}
}
