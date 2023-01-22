package com.java.springdemo;

import org.springframework.stereotype.Component;

@Component("FootballCoachComponent")
public class FootballCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;
    private String coachName;

    public FootballCoach() {
    }

    @Override
    public String getCoachFitInstructions() {
        return "Football coach is: " + getCoachName();
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    //    Setting method to inject dependency
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Get up and start running coach " + getCoachName();
    }

    @Override
    public String getTeamName() {
        return "Our coach team is " + getTeam();
    }

    @Override
    public String getDailyFortune() {
        return "Football is best for health! " + fortuneService.getFortune();
    }
}
