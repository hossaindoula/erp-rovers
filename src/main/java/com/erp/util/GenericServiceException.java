/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erp.util;

/**
 *
 * @author ronnie
 */
public class GenericServiceException extends GeneralException {

    public GenericServiceException() {
        super();
    }
    
    public GenericServiceException(String str) {
        super(str);
    }
    
    public GenericServiceException(String str, Throwable nested){
        super(str, nested);
    }
    
    public GenericServiceException(Throwable nested){
        super(nested);
    }
}
