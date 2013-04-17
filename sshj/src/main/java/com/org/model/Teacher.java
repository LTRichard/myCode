package com.org.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the teacher database table.
 * 
 */
@Entity
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String teacherName;

	//bi-directional many-to-one association to StudentTeacher
	@OneToMany(mappedBy="teacher")
	private List<StudentTeacher> studentTeachers;

	public Teacher() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<StudentTeacher> getStudentTeachers() {
		return this.studentTeachers;
	}

	public void setStudentTeachers(List<StudentTeacher> studentTeachers) {
		this.studentTeachers = studentTeachers;
	}

	public StudentTeacher addStudentTeacher(StudentTeacher studentTeacher) {
		getStudentTeachers().add(studentTeacher);
		studentTeacher.setTeacher(this);

		return studentTeacher;
	}

	public StudentTeacher removeStudentTeacher(StudentTeacher studentTeacher) {
		getStudentTeachers().remove(studentTeacher);
		studentTeacher.setTeacher(null);

		return studentTeacher;
	}

}