package com.demo.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.rest.dao.StudentDao;
import com.demo.rest.domain.Student;
import com.demo.rest.exception.StudentExistsException;
import com.demo.rest.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

	@Override
	public void registerStudent(Student student) {	
		if (getStudents().contains(student)) {
			throw new StudentExistsException();
		}
		studentDao.registerStudent(student);
	}
}