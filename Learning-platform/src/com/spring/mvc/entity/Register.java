package com.spring.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "tbl_register")
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotBlank(message = "Required field!")
	@Size(min = 3, message = "Minimum 3 & Maximum 10 characters")
	@Column(name = "first_name")
	private String fname;
	
	@NotBlank(message = "Required field!")
	@Column(name = "last_name")
	private String lname;
	
	@NotBlank(message = "Required field!")
	@Column(name = "email")
	private String email;
	
	@NotBlank(message = "Required field!")
	@Size(min = 3,max = 10, message = "Minimum 3 & Maximum 10 characters")
	@Column(name = "username")
	private String uname;
	
	@NotBlank(message = "Required field!")
	@Size(min = 8,message = "Password contains Minimum 8 characters long")
	@Column(name = "password")
	private String psw;
	
	public Register() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", uname=" + uname
				+ ", psw=" + psw + "]";
	}

	
}
