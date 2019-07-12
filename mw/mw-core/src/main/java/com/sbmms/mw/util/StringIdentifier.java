/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.mw.util;

import com.sb.mms.mw.BaseValue;

/**
 *
 * @author TP00455540
 */
public class StringIdentifier extends BaseValue {
    private String id;

    public static String valueOf(Object obj){
       return obj == null?null:((StringIdentifier)obj).getId();
    }
    
    public StringIdentifier() {
    }

    public StringIdentifier(String id) {
        this.id = id;
    }    
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
