package com.wurbo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Autowired
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach(){
        System.out.println(">> inside default constructor");
    }

//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach: inside setFortuneService() method");
//        fortuneService = theFortuneService;
//    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
