package com.demo.rest.service;

import java.util.List;

import com.demo.rest.domain.Student;

public interface StudentService {

	List<Student> getStudents();

	void registerStudent(Student student);
}