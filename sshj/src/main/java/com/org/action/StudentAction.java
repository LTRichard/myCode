package com.org.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.org.model.Class;
import com.org.model.Student;
import com.org.model.Teacher;
import com.org.service.ClassService;
import com.org.service.StudentService;
import com.org.service.TeacherService;


/**
 * student Action类
 * @author LT.x-wang
 */
@Namespace("/")
@ParentPackage(value="json-default")
@Action(
		value = "Student",
		results ={
			@Result(name="error", location="/WEB-INF/content/common/message.jsp"),
			@Result(name="success", location="/WEB-INF/content/Student.jsp")
})
public class StudentAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	@Resource
	StudentService studentService;
	@Resource
	ClassService classService;
	@Resource
	TeacherService teacherService;
	
	private Student st = new Student();
	private List<Student> listStudent = new ArrayList<Student>();
	private List<Class> listClass = new ArrayList<Class>();
	private List<Teacher> listTeacher = new ArrayList<Teacher>();
	private int id = 0;

	public List<Class> getListClass() {
		return listClass;
	}

	public void setListClass(List<Class> listClass) {
		this.listClass = listClass;
	}

	public List<Teacher> getListTeacher() {
		return listTeacher;
	}

	public void setListTeacher(List<Teacher> listTeacher) {
		this.listTeacher = listTeacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}


	/**
	 * 查询所哟学生信息
	 * @author LT.x-wang
	 * @return String
	 * @param void
	 * 2013-4-18
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public String showAllStudent() throws NoSuchMethodException, SecurityException {
		listStudent = studentService.findAll();
		listClass = classService.findAll();
		listTeacher = teacherService.findAll();
		return "success";
	}
	
	/**
	 * 保存学生信息
	 * @author LT.x-wang
	 * @return String
	 * 2013-4-18
	 */
	public String saveStudent() {
		
		studentService.save(st);
		return "success";
	}
	
	/**
	 * 根据ID查找学生
	 * @author LT.x-wang
	 * @return String 
	 * 2013-4-18
	 */
	public String getStudentById() {
		st = studentService.findStudentById(id);
		return SUCCESS;
	}
}
