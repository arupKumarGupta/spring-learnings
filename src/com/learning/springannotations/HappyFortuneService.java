package com.learning.springannotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a good day.";
    }

    @PostConstruct
    public void init() {
        System.out.println("Happy Fortune Service initialized");
    }

    /**
     * For Prototype scoped beans this methos is not called.
     */
    @PreDestroy
    public void destroy() {
        System.out.println("Happy Fortune Service Will be Destroyed");
    }
}
