package com.demo.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restapi.domain.Student;
import com.demo.restapi.service.StudentService;

@RestController 
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping(produces = "application/json")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public void registerStudent(@RequestBody Student student) {
		studentService.registerStudent(student);
	}
}