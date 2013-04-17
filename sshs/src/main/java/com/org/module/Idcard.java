package com.org.module;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the idcard database table.
 * 
 */
@Entity
public class Idcard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String address;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="idcard")
	private List<Student> students;

	public Idcard() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setIdcard(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setIdcard(null);

		return student;
	}

}