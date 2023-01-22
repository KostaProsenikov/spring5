package com.java.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FitnessCoach implements Coach {

    private final FortuneService fortuneService;

    public FitnessCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

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
        return fortuneService.getFortune();
    }
}
