package com.pt.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerStarter {




    public static void initialize(){



        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        ServerClassOne serverClassOne = ctx.getBean("serverClassOne",ServerClassOne.class);

        System.out.println(serverClassOne.greeting());
        System.out.println("appName: " + serverClassOne.getAppName());

        for (String name:
             ctx.getBeanDefinitionNames()) {
            System.out.println("bean name in server ctx: " + name);
        }

    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        ServerClassOne serverClassOne = ctx.getBean("serverClassOne",ServerClassOne.class);

        System.out.println(serverClassOne.greeting());


    }
}
