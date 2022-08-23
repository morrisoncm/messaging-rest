package com.demo.rest.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import com.demo.rest.domain.Greeting;
import com.demo.rest.domain.Person;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class GreetingRestTemplateTest {

	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;
	private String testUrl = "http://127.0.0.1:";

	@BeforeEach
	public void Setup() {
		testUrl = testUrl + port + "/demo/greetings";
	}

	@Test
	void testGetGreeting() throws URISyntaxException {
		var uri = new URI(testUrl);
		var headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		var person = new Person("Clinton", "Morrison");
		var request = new HttpEntity<Person>(person, headers);
		ResponseEntity<Greeting> result = this.restTemplate.postForEntity(uri, request, Greeting.class);
		assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	void testGetGreetingBody() throws URISyntaxException {
		assertThat(this.restTemplate.postForObject(testUrl, new Person("Clinton", "Morrison"), String.class,
				new HashMap<String, String>())).contains("Clinton Morrison");
	}
}
