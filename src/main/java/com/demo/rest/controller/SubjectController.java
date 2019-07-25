package com.demo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.domain.Subject;
import com.demo.rest.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	public List<Subject> getSubjects() {
		return subjectService.getSubjects();
	}

	
	public Subject getSubject(Subject subject) {
		return subjectService.getSubject(subject);
	}

	
	public void registerSubject(Subject subject) {
		subjectService.registerSubject(subject);
	}

	
	public void updateSubject(Subject subject) {
		subjectService.updateSubject(subject);
	}

	
	public void deleteSubject(Subject subject) {
		subjectService.deleteSubject(subject);
	}
}
