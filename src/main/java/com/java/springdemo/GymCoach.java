package com.java.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return Coach.super.getDailyWorkout();
    }

    @Autowired
    public void setFortuneService(@Qualifier("restFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getTeamName() {
        return null;
    }

    @Override
    public String getCoachFitInstructions() {
        return "Спортувай за здраве";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
