/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.oops;

/**
 *
 * @author Tamilmani
 */
public class MethodOverLoadingB extends MethoOverLoaingA{
    
    public void testOverLoaing(Integer s){
        System.out.println("Over Loaing rom B");
    }
    
    public static void main(String[] args){
        MethodOverLoadingB b = new MethodOverLoadingB();
        b.testOverLoaing(null);
    }
}
