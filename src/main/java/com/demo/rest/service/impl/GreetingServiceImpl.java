package com.demo.rest.service.impl;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.demo.rest.domain.Greeting;
import com.demo.rest.domain.Person;
import com.demo.rest.service.GreetingService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public Greeting getGreeting(Locale locale, Person person) {
        try {
            var resourceBundle = ResourceBundle.getBundle("greeting.messages.message", locale);
            var message = resourceBundle.getString("greeting");
            return new Greeting(person.getFirstname(), person.getLastname(), message);
        } catch (Exception ex) {
            log.error("Exception in GreetingServiceImpl.getGreeting()");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "A Greeting Exception has occurred!", ex);
        }
    }
}