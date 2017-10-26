package com.luvy.springdemo;

public class TrackCoach implements Coach {
    String myName;

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    public String getMyName() {
        return myName;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String setMyName() {
        return null;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    @Override
    public String getDailyFortune() {
        return "Do it:" + fortuneService.getFortune();
    }
}
