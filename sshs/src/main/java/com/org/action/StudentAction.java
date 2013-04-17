package com.org.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.org.module.Student;
import com.org.service.StudentService;

@Results({
		@Result(name="error", location="/WEB-INF/content/common/error.jsp")
	})
@Namespace("/")
public class StudentAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Resource
	StudentService studentService;
	
	private Student st = new Student();
	private List<Student> listStudent = new ArrayList<Student>();

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

	@Action(value = "/showAllStudent")
	public String showAllStudent() {
		listStudent = studentService.findAll();
		return "Student";
	}
}
