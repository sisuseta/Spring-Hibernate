/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.mms.mw;

/**
 *
 * @author TP00455540
 */
public class MWException extends Exception {
      public MWException(){
        super("MW Exception");
    }
  public MWException(String message){
        super(message);
    }
  @Override
  public String getMessage(){
      return super.getMessage();
  }
}
