package com.java.springdemo;

import org.springframework.stereotype.Component;

@Component("TrackCoachComp")
public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;
    private String coachName;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    public void doMyInitialStartStuff() {
        System.out.println("Track Coach: start up method!");
    }

    public void doMyDestroyStuff() {
        System.out.println("Track Coach: bean is destroyed!");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public String getTeamName() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5k steps daily with team: " + getTeamName();
    }

    @Override
    public String getCoachFitInstructions() {
        return "Your coach is: " + getCoachName();
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + " and send to email: " + getEmail();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
