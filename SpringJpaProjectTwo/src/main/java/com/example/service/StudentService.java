package com.example.service;

import java.util.List;


import com.example.entity.Student;

public interface StudentService {
	
	public List<Student> getStudent();
	public Student getStudentById(long studentid);
	public Student addStudent(Student student);
	public void deleteStudent(long studentid);
	public Student updateStudent(Student student);
	
	
}
