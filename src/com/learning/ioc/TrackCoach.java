package com.learning.ioc;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
