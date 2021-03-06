package com.jineric.spring_java_annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] data = {"Beware", "Diligence", "The journey is the reward"};

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);

//        String theFortune = data[index];

        return data[index];
    }
}
