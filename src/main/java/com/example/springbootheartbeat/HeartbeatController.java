package com.example.springbootheartbeat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController
{

    private static final String template = "This Spring Boot sample application is up and running, %s!";

    @RequestMapping("/")
    public String index()
    {
        return "This Spring Boot sample application is up and running!";
    }
    
    @RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
    public String heartbeat(@PathVariable String name)
    {
        //return String.format(template, name);
        return this.getCurrentDateTimeStamp() + ": " + String.format(template, name);        
    }
    
    private String getCurrentDateTimeStamp()
    {
        long currentMilliseconds = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
        Date resultdate = new Date(currentMilliseconds);
        
        return sdf.format(resultdate);
    }
}