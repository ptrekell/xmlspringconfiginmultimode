package com.example.first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.net.URL;
import java.net.URLClassLoader;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }

    @Value("${my.value}")
    private String value;

    @PostConstruct
    public void init() {
        System.out.println("here we go!!");

        System.out.println(value);




    }


}

