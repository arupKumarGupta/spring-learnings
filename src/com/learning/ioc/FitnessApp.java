package com.learning.ioc;

public class FitnessApp {
    public static void main(String[] args) {
        // create the object
        Coach coach = new TrackCoach();
        // use the object
        System.out.println(coach.getDailyWorkout());
    }
}
