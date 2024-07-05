package com.demo.rest.service;

import java.util.Locale;

import com.demo.rest.domain.Greeting;
import com.demo.rest.domain.Person;

public interface GreetingService {

    Greeting getGreeting(Locale locale, Person person);
}