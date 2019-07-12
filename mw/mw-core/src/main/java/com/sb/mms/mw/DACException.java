/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.mms.mw;

/**
 *
 * @author TP00455540
 */
public class DACException extends Throwable{
      public DACException(){
        super("DAC Exception");
    }
  public DACException(String message){
        super(message);
    }
  @Override
  public String getMessage(){
      return super.getMessage();
  }
}
