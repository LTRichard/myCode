package com.org.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private String sex;

	//bi-directional many-to-one association to Class
	@ManyToOne
	@JoinColumn(name="class_id")
	private Class clazz;

	//bi-directional many-to-one association to Idcard
	@ManyToOne
	private Idcard idcard;

	//bi-directional many-to-one association to StudentTeacher
	@OneToMany(mappedBy="student")
	private List<StudentTeacher> studentTeachers;

	public Student() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Class getClazz() {
		return this.clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public Idcard getIdcard() {
		return this.idcard;
	}

	public void setIdcard(Idcard idcard) {
		this.idcard = idcard;
	}

	public List<StudentTeacher> getStudentTeachers() {
		return this.studentTeachers;
	}

	public void setStudentTeachers(List<StudentTeacher> studentTeachers) {
		this.studentTeachers = studentTeachers;
	}

	public StudentTeacher addStudentTeacher(StudentTeacher studentTeacher) {
		getStudentTeachers().add(studentTeacher);
		studentTeacher.setStudent(this);

		return studentTeacher;
	}

	public StudentTeacher removeStudentTeacher(StudentTeacher studentTeacher) {
		getStudentTeachers().remove(studentTeacher);
		studentTeacher.setStudent(null);

		return studentTeacher;
	}

}