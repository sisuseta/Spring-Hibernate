/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.mms.mw;

import java.util.HashMap;

/**
 *
 * @author TP00455540
 */
public class Request <T extends BaseValue>{
    
    private HashMap<String,  T > params;
    
    public void add(String key, T value){
        if(params == null){
            params = new HashMap<String,  T>();
        }
        params.put(key,value);
    }
    
    public T get(String key){
        if(params == null){
           return null;
        }
        return params.get(key);
    }
}
