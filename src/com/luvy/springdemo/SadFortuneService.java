package com.luvy.springdemo;

import java.util.Random;

public class SadFortuneService implements FortuneService {

    String[] fortunes = {"happy", "Sad" , "Moody"};

    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes[random.nextInt(2)];
    }
}
