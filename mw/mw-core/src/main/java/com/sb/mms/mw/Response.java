/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.mms.mw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author TP00455540
 */
public class Response<T extends BaseValue>{
    private HashMap<String,  T > responses;
   private List<String> errors;

    public Response() {
     }

    public Response(String key, T value) {
        add( key,  value);
    }
   
    
    
    public void add(String key, T value){
        if(responses == null){
            responses = new HashMap<String,  T>();
        }
        responses.put(key,value);
    }
    
    public T get(String key){
        if(responses == null){
           return null;
        }
        return responses.get(key);
    }
    
    
    public void addError(String message){
        if(getErrors() == null){
            setErrors(new ArrayList<String>());
        }
        getErrors().add(message);
    }
    

    
    public void ERROR(String message){
       addError( message);
    }
    

    
     public boolean SUCCESS(){
        return !(getErrors() != null && !getErrors().isEmpty());
    }

    /**
     * @return the errors
     */
    public List<String> getErrors() {
        return errors;
    }

    /**
     * @param errors the errors to set
     */
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
