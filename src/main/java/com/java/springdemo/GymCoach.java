package com.java.springdemo;

import org.springframework.stereotype.Component;

@Component("GymCoachComponent")
public class GymCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return Coach.super.getDailyWorkout();
    }

    @Override
    public String getTeamName() {
        return null;
    }

    @Override
    public String getCoachFitInstructions() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
