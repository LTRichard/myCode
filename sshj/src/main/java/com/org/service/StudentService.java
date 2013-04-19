package com.org.service;

import java.util.List;

import com.org.model.Student;

public interface StudentService {
	/*��ѯ����ѧ��*/
	public List<Student> findAll();
	
	/*����id����ѧ��*/
	public Student findStudentById(Integer id);
	
	/*����IDɾ��ѧ��*/
	public void deleteStudentById(Integer Id);
	/*����ѧ����Ϣ*/
	public void save(Student sdt);
	/*����ѧ����Ϣ*/
	public void updateStudent(Student sdt);
}
