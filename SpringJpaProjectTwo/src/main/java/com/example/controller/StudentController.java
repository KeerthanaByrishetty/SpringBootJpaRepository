package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/home")
	public String home() {
		return "This is home page for testing";
	}
	
	@GetMapping("/student")
	public List<Student> getEmployees() {
	return this.studentservice.getStudent();
	}
	
	
	@PostMapping("/student")
	public Student addEmployee(@RequestBody Student student) {
		return this.studentservice.addStudent(student);
	}
	
	@DeleteMapping("/student/{studentid}")
	public void deleteStudent(@PathVariable long studentid) {
		this.studentservice.deleteStudent(studentid);
		
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentservice.updateStudent(student);
	}


}
