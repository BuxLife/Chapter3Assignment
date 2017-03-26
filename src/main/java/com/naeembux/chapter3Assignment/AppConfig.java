package com.naeembux.chapter3Assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{
    @Bean(name = "listload")
    public LoadListInterface getService(){
        return new MapCollection();
    }


}

