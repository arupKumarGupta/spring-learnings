package com.learning.ioc;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is you lucky day";
    }
}
