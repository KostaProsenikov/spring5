package com.java.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FitnessCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Fitness coach says: run 6k every day to be healthier!";
    }

    @Override
    public String getTeamName() {
        return "Get Fitness Coach Name";
    }

    @Override
    public String getCoachFitInstructions() {
        return "Coach encourages you to be healthy!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
