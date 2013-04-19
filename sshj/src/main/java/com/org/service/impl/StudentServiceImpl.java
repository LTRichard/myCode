package com.org.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.org.common.CodeCommon;
import com.org.dao.MyMapDao;
import com.org.model.Student;
import com.org.service.StudentService;

/**
 * @author LT.x-wang
 * studentÒµÎñÂß¼­
 */
@Service("studentService")
public class StudentServiceImpl extends BaseService implements StudentService {

	@Resource
	MyMapDao myMapDao;
	/* (non-Javadoc)
	 * @see com.org.service.StudentService#findAll()
	 */
	public List<Student> findAll() {
		List<Student> l = new ArrayList<Student>();
		l = baseDaoImpl.getScrollData(Student.class).getResultlist();
		myMapDao.getMapData(Student.class, "id", "name", null, null, null);
		return dealResult(CodeCommon._sb2jsp,l) ;
	}
	
	/* (non-Javadoc)
	 * @see com.org.service.StudentService#findStudentById(java.lang.Integer)
	 */
	public Student findStudentById(Integer id) {
		return baseDaoImpl.find(Student.class, id);
	}

	/* (non-Javadoc)
	 * @see com.org.service.StudentService#deleteStudentById(java.lang.Integer)
	 */
	public void deleteStudentById(Integer Id) {
		baseDaoImpl.delete(Student.class, Id);

	}

	/* (non-Javadoc)
	 * @see com.org.service.StudentService#save(com.org.model.Student)
	 */
	public void save(Student sdt) {
		baseDaoImpl.save(sdt);

	}

	/* (non-Javadoc)
	 * @see com.org.service.StudentService#updateStudent(com.org.model.Student)
	 */
	public void updateStudent(Student sdt) {
		baseDaoImpl.update(sdt);

	}

}
