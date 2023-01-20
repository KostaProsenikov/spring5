package com.java.springdemo;

public class BaseballCoach implements Coach {

    //    define a private field for dependency
    private final FortuneService fortuneService;

    //    define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getTeamName() {
        return "Base team ";
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 60 minutes in Gym!";
    }

    @Override
    public String getDailyFortune() {
//        use fortune service
        return "Base coach do it right! " + fortuneService.getFortune();
    }
}
