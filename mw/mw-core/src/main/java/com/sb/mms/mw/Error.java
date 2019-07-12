/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sb.mms.mw;

/**
 *
 * @author TP00455540
 */
public class Error extends BaseValue{
    private String code;
    private String message;
    private Exception exception;

    public Error() {
    }

    public Error(String code, Exception exception) {
        this.code = code;
        this.message = exception.getMessage();
        this.exception = exception;
    }
        
    public Error(String code, String message, Exception exception) {
        this.code = code;
        this.message = message;
        this.exception = exception;
    }

    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the e
     */
    public Exception getException() {
        return exception;
    }

    /**
     * @param e the e to set
     */
    public void setException(Exception exception) {
        this.exception = exception;
    }
}
