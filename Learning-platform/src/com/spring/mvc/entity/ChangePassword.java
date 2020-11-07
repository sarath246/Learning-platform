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
public class ChangePassword {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank(message = "Required field")
	private String psw;
	
	@NotBlank(message = "required field")
	private String newPsw;

	@NotBlank(message = "required field")
	@Column(name = "password")
	private String confirmPsw;

	
	public ChangePassword() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getNewPsw() {
		return newPsw;
	}

	public void setNewPsw(String newPsw) {
		this.newPsw = newPsw;
	}

	public String getConfirmPsw() {
		return confirmPsw;
	}

	public void setConfirmPsw(String confirmPsw) {
		this.confirmPsw = confirmPsw;
	}

	@Override
	public String toString() {
		return "ChangePassword [id=" + id + ", psw=" + psw + ", newPsw=" + newPsw + ", confirmPsw=" + confirmPsw + "]";
	}
	
}
