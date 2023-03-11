package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.dto.StudDataDto;
import com.student.entities.Student;
import com.student.services.StudentService;
import com.student.util.EmailService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private EmailService emailService;
	
	//Handler Methods 
	
	//1stmethod
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String viewCreateStudForm() {
		return "create_stud";
	}

	
	
	//2nd Method 
	//http://localhost:8080/saveStud
	@RequestMapping("/saveStud")
	public String saveLead( @ModelAttribute("stud") Student stud, Model model) {
		model.addAttribute("msg", "Record is saved");
		emailService.sendEmail(stud.getEmail(), "Welcome Email Hey Candidate your registration has been sucessfull", " Bellow details are for your next acedemic operations");
		studentService.saveOneStud(stud);
		return "create_stud";
	}
	
	 
	//3rd method another method to read data  
	//http://localhost:8080/saveStud
//	@RequestMapping("/saveStud")
//	public String savetheStud(@RequestParam("firstName")String firstName,@RequestParam("lastName") String lastName, @RequestParam("email") String email,@RequestParam("mobile") Long mobile) {
//		Student stud= new Student();
//		stud.setFirstName(firstName);
//		stud.setLastName(lastName);
//		stud.setEmail(email);
//		stud.setMobile(mobile);
//		studentService.saveOneStud(stud);
//		return "create_stud";
//	}
	
	
	//4th method  another method to read data 
//	@RequestMapping("/saveStud")
//	public String saveDtoStud(StudDataDto studData) {
//	Student stud= new Student();
//	stud.setFirstName(studData.getFirstName());
//		stud.setLastName(studData.getLastName());
//	stud.setEmail(studData.getEmail());
//		stud.setMobile(studData.getMobile());
//	studentService.saveOneStud(stud);
//		return "create_stud";
//	}
	
	
	@RequestMapping("/listall")
	 public String listStuds(Model model) {
		List<Student> students = studentService.getAllStuds();
		model.addAttribute("stud", students);
		return "list_stud";
	}
	
	@RequestMapping("/delete")
	public String deleteOneStud(@RequestParam("id")long id,Model model) {
		studentService.deleteStud(id);
		
		
		List<Student> student = studentService.getAllStuds();
		model.addAttribute("stud", student);
		return "list_stud";
	}
	
	@RequestMapping("/update")
	public String updateOneString(@RequestParam("id")long id,Model model) {
		Student student= studentService.getStudById(id);
		model.addAttribute("stud", student);
		return "update_stud";

	}
	
	@RequestMapping("/updateStud")
	public String updateStud( @ModelAttribute("stud") Student stud, Model model) {
		
		studentService.saveOneStud(stud);
		List<Student> student = studentService.getAllStuds();
		model.addAttribute("stud", student);
		return "list_stud";
		
	}
	
}
