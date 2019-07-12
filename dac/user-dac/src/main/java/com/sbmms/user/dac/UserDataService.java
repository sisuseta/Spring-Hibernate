/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.user.dac;

import com.sb.mms.mw.DACException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.Response;

/**
 *
 * @author TP00455540
 */
public interface UserDataService {
    public Response findByUserName(Request req) throws DACException;
}
