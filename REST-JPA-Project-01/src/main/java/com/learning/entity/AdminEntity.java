package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminEntity {
	
	@Id
	private String uname;
	private String pword;
	public AdminEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminEntity(String uname, String pword) {
		super();
		this.uname = uname;
		this.pword = pword;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	
	
	
}
