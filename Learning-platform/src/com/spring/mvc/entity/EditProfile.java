package com.spring.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "tbl_register")
public class EditProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank
	@Column(name = "fname")
	private String fname;
	
	@NotBlank
	@Column(name = "lname")
	private String lname;
	
	@NotBlank
	@Column(name = "uname")
	private String uname;
	
	@NotBlank
	@Column(name = "email")
	private String email;

	public EditProfile() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EditProfile [id=" + id + ", fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", email="
				+ email + "]";
	}
	
}
