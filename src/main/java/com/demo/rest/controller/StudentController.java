package com.demo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.domain.Student;
import com.demo.rest.service.StudentService;

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
	
	public Student getStudent(@RequestBody Student student) {
		return studentService.getStudent(student);
	}
	
	public void updateProfile (@RequestBody Student student) {
		studentService.updateProfile(student);
	}

	public void deleteProfile(@RequestBody Student student) {
		studentService.deleteProfile(student);
	}
}