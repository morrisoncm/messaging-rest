package com.demo.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.demo.rest.controller.StudentController;
import com.demo.rest.domain.Student;
import com.demo.rest.domain.Subject;
import com.demo.rest.service.StudentService;
import com.google.gson.Gson;

@ExtendWith(SpringExtension.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {

	private static final String URL = "/students";
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private StudentService empService;

	@Test
	public void testRegisterStudent() throws Exception {

		Student johnDoeStudent = new Student("Peter", "Roe", Arrays.asList(new Subject("Mathematics", LocalDateTime.now(), LocalDateTime.now())));
		ResultActions result = mockMvc.perform(MockMvcRequestBuilders.post(URL).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON).content(new Gson().toJson(johnDoeStudent)));

        int status = result.andReturn().getResponse().getStatus();
        assertEquals(HttpStatus.CREATED.value(), status, "Incorrect Response Status");
	}

	@Test
	public void testgetStudents() {

	}

}
