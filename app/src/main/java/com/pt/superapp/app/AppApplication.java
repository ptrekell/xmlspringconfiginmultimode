package com.pt.superapp.app;

import com.pt.server.ServerStarter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan({"com.pt.superapp.app"})
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Autowired
    ApplicationContext context;

    @PostConstruct
    public void init() {

        System.out.println("here we go baby from springboot app!");

        for (String name :
                context.getBeanDefinitionNames()) {
            System.out.println("bean name: " + name);

        }

        System.out.println("about to trigger server");



        ServerStarter.initialize();
    }

}

