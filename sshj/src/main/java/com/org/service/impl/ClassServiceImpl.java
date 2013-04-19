package com.org.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.model.Class;
import com.org.service.ClassService;

@Service("classService")
public class ClassServiceImpl extends BaseService implements ClassService {

	@Override
	public List<Class> findAll() {
		return baseDaoImpl.getScrollData(Class.class).getResultlist();
	}

	@Override
	public Class findClassById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClassById(Integer Id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Class sdt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClass(Class sdt) {
		// TODO Auto-generated method stub

	}

}
