/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.mms.mw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TP00455540
 */
public class ViewResponse extends BaseValue{
    private BaseValue data;
    private List<? extends BaseValue> list;
    private List<String> errors;
    public ViewResponse() {
    }

    public ViewResponse(String key, Response res) {
       data = res.get(key);
       if(!res.SUCCESS()){
          errors = res.getErrors();
       }
    }

   public void addDACError(String message){
       addError("DAC "+message);
    }
    public void addMWError(String message){
       addError("mw "+message);
    }
    public void addPresentationError(String message){
       addError("Presentation "+message);
    }    
    private void addError(String message){
        if(getErrors() == null){
            setErrors(new ArrayList<String>());
        }
        getErrors().add(message);
    }
    /**
     * @return the success
     */
    public boolean isSuccess() {
        return !(getErrors() != null && !getErrors().isEmpty());
    }

    /**
     * @return the data
     */
    public BaseValue getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(BaseValue data) {
        this.data = data;
    }

    /**
     * @return the list
     */
    public List<? extends BaseValue> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<? extends BaseValue> list) {
        this.list = list;
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
