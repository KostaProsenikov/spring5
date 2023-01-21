package com.java.springdemo;

public class BaseballCoach implements Coach {

    //    define a private field for dependency
    private final FortuneService fortuneService;
    private String coachName;

    //    define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public String getCoachFitInstructions() {
        return "Baseball coach is " + getCoachName();
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
