package com.demo.rest.service;

import com.demo.rest.domain.Greeting;
import com.demo.rest.domain.Person;

import java.util.Locale;

public interface GreetingService {

    Greeting getGreeting(Locale locale, Person person);
}