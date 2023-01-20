package com.java.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
//        load the spring config file
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        retrieve a bean from spring container
        Coach footballCoach = ctx.getBean("footballCoach", FootballCoach.class);

//        Football coach class
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyFortune());
        System.out.println(footballCoach.getTeamName());
//        close the context
        ctx.close();
    }
}
