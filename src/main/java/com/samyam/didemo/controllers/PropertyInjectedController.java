package com.samyam.didemo.controllers;

import com.samyam.didemo.services.GreetingService;
import com.samyam.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
