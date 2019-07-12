/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.dac;


import org.hibernate.Criteria;

/**
 *
 * @author TP00455540
 */
public interface GenericDAO<T> {

    T create(T t);

    void delete(Object id);


    public T executeunique( Criteria  c);

    public void update( T t);

}