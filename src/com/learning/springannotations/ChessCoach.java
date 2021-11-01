package com.learning.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/**
 * Constructor injection Autowiring
 */


@Component
public class ChessCoach implements Coach {

    FortuneService fortuneService;

    @Autowired
    public ChessCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Kings Gambit";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
