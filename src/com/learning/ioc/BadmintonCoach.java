package com.learning.ioc;

public class BadmintonCoach implements Coach {

    private String teamName;
    private FortuneService fortuneService;

    public BadmintonCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Backhand clear, 3rd court";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune() + " " + this.getTeamName();
    }
}
