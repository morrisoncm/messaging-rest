package com.demo.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.domain.Greeting;
import com.demo.rest.domain.Person;
import com.demo.rest.service.GreetingService;

@RestController 
@RequestMapping("/greetings")
public class GreetingController {

	@Autowired
	private GreetingService greetingService;
	
	@PostMapping
	public Greeting getGreeting(HttpServletRequest httpServletRequest, @RequestBody Person person){
		return greetingService.getGreeting(httpServletRequest.getLocale(), person);
	}
}