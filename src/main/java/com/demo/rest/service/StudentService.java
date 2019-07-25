package com.demo.rest.service;

import java.util.List;

import com.demo.rest.domain.Student;

public interface StudentService {

	List<Student> getStudents();
	
	Student getStudent(Student student);

	void registerStudent(Student student);
	
	void updateProfile(Student student);
	
	void deleteProfile(Student student);
}