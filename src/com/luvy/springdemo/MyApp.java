package com.luvy.springdemo;

public class MyApp {
    public static void main(String[] args){

        //create object
        Coach theCoach = new TrackCoach(new HappyFortuneService());

        //use object
        System.out.println(theCoach.getDailyWorkout());
    }
}
