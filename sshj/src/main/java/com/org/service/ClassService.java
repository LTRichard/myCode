package com.org.service;

import java.util.List;

import com.org.model.Class;

public interface ClassService {
	/*��ѯ������ʦ*/
	public List<Class> findAll();
	/*����id����ѧ��*/
	public Class findClassById(Integer id);
	/*����IDɾ��ѧ��*/
	public void deleteClassById(Integer Id);
	/*����ѧ����Ϣ*/
	public void save(Class sdt);
	/*����ѧ����Ϣ*/
	public void updateClass(Class sdt);
}
