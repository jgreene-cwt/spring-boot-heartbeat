package com.example.springbootheartbeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootHeartbeatApplication extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(SpringBootHeartbeatApplication.class);
    }
    
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(SpringBootHeartbeatApplication.class, args);
    }
}
