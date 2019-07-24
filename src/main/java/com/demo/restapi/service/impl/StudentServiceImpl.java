package com.demo.restapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.restapi.dao.StudentDao;
import com.demo.restapi.domain.Student;
import com.demo.restapi.exception.StudentExistsException;
import com.demo.restapi.service.StudentService;

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