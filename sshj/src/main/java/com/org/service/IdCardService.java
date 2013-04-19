package com.org.service;

import java.util.List;

import com.org.model.Idcard;

public interface IdCardService {
	/*��ѯ������ʦ*/
	public List<Idcard> findAll();
	/*����id����ѧ��*/
	public Idcard findIdcardById(Integer id);
	/*����IDɾ��ѧ��*/
	public void deleteIdcardById(Integer Id);
	/*����ѧ����Ϣ*/
	public void save(Idcard sdt);
	/*����ѧ����Ϣ*/
	public void updateIdcard(Idcard sdt);
}
