package com.java.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class HappyFortuneService implements FortuneService {

    String[] fortunes = {"здраве", "щастие", "късмет", "пътуване"};
    Random rand = new Random();

    public String getRandArrayElement() {
        return fortunes[rand.nextInt(fortunes.length)];
    }

    @Override
    public String getFortune() {
        return "Твоят късмет за днес е " + getRandArrayElement() + "!";
    }
}
