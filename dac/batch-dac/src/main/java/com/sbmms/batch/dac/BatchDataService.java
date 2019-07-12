/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.batch.dac;

import com.sb.mms.mw.DACException;
import com.sb.mms.mw.Request;
import com.sb.mms.mw.Response;

/**
 *
 * @author TP00455540
 */
public interface BatchDataService {
    public Response executeBatchFile(Request req) throws DACException;
}
