package com.learning.ioc;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;


    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice in swing";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
