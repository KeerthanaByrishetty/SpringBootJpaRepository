package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDAO;

import com.example.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

	@Override
	public Student getStudentById(long studentid) {
		// TODO Auto-generated method stub
		return studentDAO.getOne(null);
	}

	@Override
	public Student addStudent(Student student) {
		studentDAO.save(student);
		return student;
	}

	@Override
	public void deleteStudent(long studentid) {
		Student s=studentDAO.getOne(studentid);
		studentDAO.delete(s);
		
		}

	@Override
	public Student updateStudent(Student student) {
		studentDAO.save(student);
		return student;
		
	}



	

}
