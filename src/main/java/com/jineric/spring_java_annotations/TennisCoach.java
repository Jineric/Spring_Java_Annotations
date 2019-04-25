package com.jineric.spring_java_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //default name is tennisCoach
@Scope("prototype")
//@Component("theSillyCoach") --for naming the spring bean
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Inside default constructor");
    }

    /*
    @Autowired
    public void doSomethingElse(FortuneService theFortuneService) {
        System.out.println("Insided of the doSomethingElse() method");
        fortuneService = theFortuneService;
    }
     */

    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
     */

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }
}