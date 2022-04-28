package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	private long id;
	private String name;
	private String section;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, String section) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", section=" + section + "]";
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	

}
