/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.mw.util;

import com.sb.mms.mw.BaseValue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TP00455540
 */
public class DataList<T> extends BaseValue {
    private List<T> list;
    public void add(T t){
        if(list != null){
            list = new ArrayList<T>();
        }
        list.add(t);
    }
    public boolean isEmpty(){
        return !(list != null && !list.isEmpty());
    }
    public List<T> list(){
        return list;
    }
}
