package com.org.service;

import java.util.List;

import com.org.model.Student;

public interface StudentService {

	public List<Student> findAll();
	
	public Student findStudentById(Integer id);
	
	public void deleteStudentById(Integer Id);
	
	public void save(Student sdt);
	
	public void updateStudent(Student sdt);
}
