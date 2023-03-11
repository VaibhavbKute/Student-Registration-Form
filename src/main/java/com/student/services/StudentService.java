package com.student.services;

import java.util.List;

import com.student.entities.Student;

public interface StudentService {
	public void saveOneStud(Student stud);

	public List<Student> getAllStuds();

	public void deleteStud(long id);

	public Student getStudById(long id);
}
