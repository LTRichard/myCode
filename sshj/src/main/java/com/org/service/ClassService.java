package com.org.service;

import java.util.List;

import com.org.model.Class;

public interface ClassService {
	/*查询所有老师*/
	public List<Class> findAll();
	/*根据id查找学生*/
	public Class findClassById(Integer id);
	/*根据ID删除学生*/
	public void deleteClassById(Integer Id);
	/*保存学生信息*/
	public void save(Class sdt);
	/*更新学生信息*/
	public void updateClass(Class sdt);
}
