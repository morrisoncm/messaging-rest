package com.demo.rest.dao;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.rest.domain.Student;
import com.demo.rest.domain.Subject;

@Repository
public class StudentDao {

	private List<Student> students = Arrays.asList(
			new Student("John", "Doe", Arrays.asList(new Subject("English", LocalDateTime.now(), LocalDateTime.now()))),
			new Student("Jane", "Doe", Arrays.asList(new Subject("French", LocalDateTime.now(), LocalDateTime.now()))));

	public List<Student> getStudents() {
		return students;
	}

	public void registerStudent(Student student) {
		students.add(student);
	}
}