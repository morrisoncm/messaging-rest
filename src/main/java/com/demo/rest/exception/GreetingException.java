package com.demo.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Greeting Exception has occurred!")
public class GreetingException extends RuntimeException {

    private static final long serialVersionUID = 687957859330403391L;

    public GreetingException() {
        super();
    }
}
