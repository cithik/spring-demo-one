package com.luvy.springdemo;

public class SwimmingCoach implements Coach{
    private FortuneService fortuneService;

    public SwimmingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Swim";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getMyName() {
        return null;
    }

    @Override
    public String setMyName() {
        return null;
    }
}
