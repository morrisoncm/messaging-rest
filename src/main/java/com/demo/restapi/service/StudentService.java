package com.demo.restapi.service;

import java.util.List;

import com.demo.restapi.domain.Student;

public interface StudentService {

	List<Student> getStudents();

	void registerStudent(Student student);
}