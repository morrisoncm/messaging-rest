package com.demo.rest.service;

import java.util.List;

import com.demo.rest.domain.Subject;

public interface SubjectService {

	List<Subject> getSubjects();
	
	Subject getSubject(Subject subject);

	void registerSubject(Subject subject);
	
	void updateSubject(Subject subject);
	
	void deleteSubject(Subject subject);
}
