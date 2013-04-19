package com.org.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.model.Teacher;
import com.org.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl extends BaseService implements TeacherService {

	@Override
	public List<Teacher> findAll() {
		return baseDaoImpl.getScrollData(Teacher.class).getResultlist();
	}

	@Override
	public Teacher findTeacherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTeacherById(Integer Id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Teacher sdt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTeacher(Teacher sdt) {
		// TODO Auto-generated method stub

	}

}
