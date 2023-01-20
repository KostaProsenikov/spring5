package com.java.springdemo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your very lucky day from Fortune Service!";
    }
}
