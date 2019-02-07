package com.pt.server;


import org.springframework.stereotype.Component;

@Component
public class ServerClassOne {

     private String appName;

     public String greeting() {
        return "hello from ServerClassOne";
    }


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
