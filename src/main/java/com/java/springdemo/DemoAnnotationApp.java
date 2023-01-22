package com.java.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotationApp {

    public static void main(String[] args) {
        // Read the Spring config file
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationComponentsContext.xml");
        // get the bean from spring container
        Coach theCoach = ctx.getBean("GymCoachComponent", Coach.class);
        Coach fitnessCoach = ctx.getBean("fitnessCoach", Coach.class);
        //        call methods on the bean

        // Base coach class
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getCoachFitInstructions());

        System.out.println(fitnessCoach.getDailyWorkout());
        System.out.println(fitnessCoach.getCoachFitInstructions());
        System.out.println(fitnessCoach.getDailyFortune());

        // close the context
        ctx.close();
    }
}
