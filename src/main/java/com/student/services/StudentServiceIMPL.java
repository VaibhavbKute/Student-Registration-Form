package com.student.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private StudentRepository studRepo;
	
	@Override
	public void saveOneStud(Student student) {
		studRepo.save(student);
	}

	@Override
	public List<Student> getAllStuds() {
		List<Student> students = studRepo.findAll();
		return students;
	}

	@Override
	public void deleteStud(long id) {
		studRepo.deleteById(id);
		
	}

	@Override
	public Student getStudById(long id) {
		Optional<Student> findById = studRepo.findById(id);
		Student student = findById.get();
		return student;
	}

}
