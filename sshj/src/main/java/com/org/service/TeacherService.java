package com.org.service;

import java.util.List;

import com.org.model.Teacher;

public interface TeacherService {
	/*查询所有老师*/
	public List<Teacher> findAll();
	/*根据id查找学生*/
	public Teacher findTeacherById(Integer id);
	/*根据ID删除学生*/
	public void deleteTeacherById(Integer Id);
	/*保存学生信息*/
	public void save(Teacher sdt);
	/*更新学生信息*/
	public void updateTeacher(Teacher sdt);
}
