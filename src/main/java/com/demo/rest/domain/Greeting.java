package com.demo.rest.domain;

public class Greeting {

    private String message;

    public Greeting() {
        super();
    }

    public Greeting(String firstname, String lastname, String message) {
        this.message = firstname + " " + lastname + " " + message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}