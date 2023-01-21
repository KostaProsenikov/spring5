package com.java.springdemo;

public interface Coach {

    default String getDailyWorkout() {
        return "Spend 60 minutes outside!";
    }

    String getTeamName();

    String getCoachFitInstructions();

    String getDailyFortune();
}
