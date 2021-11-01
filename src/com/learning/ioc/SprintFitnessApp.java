package com.learning.ioc;

import com.learning.ioc.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SprintFitnessApp {
    public static void main(String[] args) {
        // load configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from the container
        Coach coach = context.getBean("coach3", Coach.class);

        // use the bean
        System.out.println(coach.getDailyFortune()+" but " +coach.getDailyWorkout());
        // close application context
        context.close();
    }
}
