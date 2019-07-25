package com.demo.rest.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Subject {

	@NotBlank(message = "Subject name is required")
	@Size(max = 50, message = "Subject name cannot be greater than 50")
	private String subjectName;
	@NotBlank(message = "Subject description is required")
	@Size(max = 250, message = "Subject description cannot be greater than 250")
	private String subjectDescription;

	public Subject() {
		super();
	}

	public Subject(String subjectName, String subjectDescription) {
		super();
		this.subjectName = subjectName;
		this.subjectDescription = subjectDescription;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectDescription() {
		return subjectDescription;
	}

	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		return true;
	}
}