package com.org.module;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "idCard" database table.
 * 
 */
@Entity
@Table(name="\"idCard\"")
public class IdCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String address;

	//bi-directional one-to-one association to Student
	@OneToOne(mappedBy="idCard")
	private Student student;

	public IdCard() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}