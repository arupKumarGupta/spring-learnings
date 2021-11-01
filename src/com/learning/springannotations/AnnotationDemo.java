package com.learning.springannotations;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-config.xml");
        Coach badmintonCoach = context.getBean("baddy", Coach.class);
        Coach badmintonCoach2 = context.getBean("baddy", Coach.class);
        System.out.println(badmintonCoach + " == " + badmintonCoach2);
        System.out.println(badmintonCoach.getDailyWorkout());
        System.out.println(badmintonCoach.getDailyFortune());

        Coach chessCoach = context.getBean("chessCoach", Coach.class);
        Coach chessCoach2 = context.getBean("chessCoach", Coach.class);
        System.out.println(chessCoach + " == " + chessCoach2);
        System.out.println(chessCoach.getDailyWorkout());
        System.out.println(chessCoach.getDailyFortune());

        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyFortune());
        context.close();
    }
}
