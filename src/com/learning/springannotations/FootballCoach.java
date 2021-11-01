package com.learning.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/**
 * Field/Property injection Autowiring
 */


@Component
public class FootballCoach implements Coach {
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run 50 laps";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
