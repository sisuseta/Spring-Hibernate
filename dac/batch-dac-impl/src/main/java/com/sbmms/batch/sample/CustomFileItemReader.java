/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.batch.sample;

import org.springframework.batch.item.file.FlatFileItemReader;


public class CustomFileItemReader extends FlatFileItemReader {
    
    @Override
    public void afterPropertiesSet() throws Exception {  
        setRecordSeparatorPolicy(new HandleBlankPolicy());
        super.afterPropertiesSet();
    }
}
