package com.org.service.impl;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.BaseDao;
import com.org.module.Student;
import com.org.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	BaseDao baseDaoImpl;

	public List<Student> findAll() {
		List<Student> l = new ArrayList<Student>();
		l = baseDaoImpl.getScrollData(Student.class).getResultlist();
		l.add(baseDaoImpl.find(Student.class, 1));
		return l ;
	}

	public Student findStudentById(Integer id) {
		
		return null;
	}

	public void deleteStudentById(Integer Id) {
		

	}

	public void save(Student sdt) {
		

	}

	public void updateStudent(Student sdt) {
		

	}

}
