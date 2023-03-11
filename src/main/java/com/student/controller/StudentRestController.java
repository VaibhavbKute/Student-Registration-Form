package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entities.Student;
import com.student.repository.StudentRepository;

@RestController
@RequestMapping("/api/studs")
public class StudentRestController {

		@Autowired
		private StudentRepository studRepo;
		
		@GetMapping
		public List<Student> getAllStuds(){
		List<Student> stud = studRepo.findAll();
		return stud;
		}
		@PostMapping
		public void saveOneStud(@RequestBody Student stud) {
			studRepo.save(stud);
		}
		
		@PutMapping
		public void updateOneStud(@RequestBody Student stud) {
			studRepo.save(stud);
		}
		
		
		@DeleteMapping("/delete/{id}")
		public void deleteOneStud(@PathVariable("id") long id) {
			studRepo.deleteById(id);
		}
	@GetMapping("/find/{id}")
		public Student getOneStudk(@PathVariable("id") long id) {
			Optional<Student> findById = studRepo.findById(id);
			Student stud = findById.get();
			return stud;	
		}
		@RequestMapping("/search/{id}")
		public Student getOneStud(@PathVariable("id") long id) {
			Optional<Student> findById = studRepo.findById(id);
			Student stud = findById.get();
			return stud;	
		}
}
		
