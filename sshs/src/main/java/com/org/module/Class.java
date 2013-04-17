package com.org.module;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the class database table.
 * 
 */
@Entity
public class Class implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(insertable=false, updatable=false)
	private Integer id;

	@Column(name="\"className\"")
	private String className;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="clazz")
	private List<Student> students;

	public Class() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setClazz(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setClazz(null);

		return student;
	}

}