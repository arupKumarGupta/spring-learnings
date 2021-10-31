package com.learning.ioc;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] fortunes = {"Rough times ahead", "Money day", "Losses today"};
    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes[random.nextInt(fortunes.length)];
    }
}
