package com.samyam.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo! Dies ist von der Implementierung des primären deutschen Begrüßungsdienstes.";
    }
}
