package com.learning.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope.xml");
        Coach coach = context.getBean("coach", Coach.class);
        Coach alpha = context.getBean("coach2", Coach.class);

        System.out.println(coach == alpha);
        System.out.println(coach + " == " + alpha);

        context.close();
    }
}
