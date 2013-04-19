package com.org.service;

import java.util.List;

import com.org.model.Idcard;

public interface IdCardService {
	/*查询所有老师*/
	public List<Idcard> findAll();
	/*根据id查找学生*/
	public Idcard findIdcardById(Integer id);
	/*根据ID删除学生*/
	public void deleteIdcardById(Integer Id);
	/*保存学生信息*/
	public void save(Idcard sdt);
	/*更新学生信息*/
	public void updateIdcard(Idcard sdt);
}
