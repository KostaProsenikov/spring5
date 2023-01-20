package com.java.springdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 60 minutes in Gym!";
    }
}
