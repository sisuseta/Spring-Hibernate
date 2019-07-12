/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.ui.utils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbmms.event.util.Event;
import com.sbmms.user.util.Address;
import com.sbmms.user.util.Member;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Arrays;
import org.springframework.util.FileCopyUtils;

/**
 *
 * @author BK Tamilmani
 */
public class DummyDataUtils {
    private static DummyDataUtils instance=null;
    
    public static DummyDataUtils getInstance(){
        if(instance == null){
            instance = new DummyDataUtils();
        }
        return instance;
    }
    private DummyDataUtils(){
        
    }
    private InputStream getJsonStream(String jsonName){
         try{
        ClassLoader classLoader = getClass().getClassLoader();        
        InputStream in = classLoader.getResourceAsStream("jsons/"+jsonName);
        return in;
        }catch(Exception e){
            e.printStackTrace();
        } 
         return null;
    }
    public List<Address> getAdderss(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new String(FileCopyUtils.copyToByteArray(getJsonStream("address.json")), StandardCharsets.UTF_8), new TypeReference<List<Address>>(){} );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
       public List<Event> getEvents(){
        ObjectMapper mapper = new ObjectMapper();
        final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        mapper.setDateFormat(df);
        try {
            return mapper.readValue(new String(FileCopyUtils.copyToByteArray(getJsonStream("event.json")), StandardCharsets.UTF_8), new TypeReference<List<Event>>(){} );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
       
       public List<Member> getMembers(){
        ObjectMapper mapper = new ObjectMapper();
        final DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        mapper.setDateFormat(df);
        try {
            return mapper.readValue(new String(FileCopyUtils.copyToByteArray(getJsonStream("members.json")), StandardCharsets.UTF_8), new TypeReference<List<Member>>(){} );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
