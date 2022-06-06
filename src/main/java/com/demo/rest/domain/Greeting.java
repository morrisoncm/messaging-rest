package com.demo.rest.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeting {

	private String message;

	public Greeting(String firstname, String lastname, String message) {
		this.message = new StringBuilder().append(firstname).append(" ").append(lastname).append(" ").append(message)
				.toString();
	}

}