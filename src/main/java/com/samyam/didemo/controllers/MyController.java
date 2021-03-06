package com.samyam.didemo.controllers;


import com.samyam.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String Hello(){

        return greetingService.sayGreeting();
    }
}
