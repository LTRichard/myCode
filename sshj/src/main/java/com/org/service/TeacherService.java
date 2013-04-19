package com.org.service;

import java.util.List;

import com.org.model.Teacher;

public interface TeacherService {
	/*��ѯ������ʦ*/
	public List<Teacher> findAll();
	/*����id����ѧ��*/
	public Teacher findTeacherById(Integer id);
	/*����IDɾ��ѧ��*/
	public void deleteTeacherById(Integer Id);
	/*����ѧ����Ϣ*/
	public void save(Teacher sdt);
	/*����ѧ����Ϣ*/
	public void updateTeacher(Teacher sdt);
}
