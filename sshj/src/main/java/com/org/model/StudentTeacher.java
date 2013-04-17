package com.org.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student_teacher database table.
 * 
 */
@Entity
@Table(name="student_teacher")
public class StudentTeacher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to Student
	@ManyToOne
	private Student student;

	//bi-directional many-to-one association to Teacher
	@ManyToOne
	private Teacher teacher;

	public StudentTeacher() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}