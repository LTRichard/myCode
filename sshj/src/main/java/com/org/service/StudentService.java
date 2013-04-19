package com.org.service;

import java.util.List;

import com.org.model.Student;

public interface StudentService {
	/*查询所有学生*/
	public List<Student> findAll();
	
	/*根据id查找学生*/
	public Student findStudentById(Integer id);
	
	/*根据ID删除学生*/
	public void deleteStudentById(Integer Id);
	/*保存学生信息*/
	public void save(Student sdt);
	/*更新学生信息*/
	public void updateStudent(Student sdt);
}
