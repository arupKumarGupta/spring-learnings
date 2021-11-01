package com.learning.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Setter injection Autowiring
 */

@Component("baddy")
@Scope("prototype")
public class BadmintonCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Smash Practice";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
