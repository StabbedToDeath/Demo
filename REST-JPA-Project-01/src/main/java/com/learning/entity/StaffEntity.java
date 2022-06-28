package com.learning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StaffEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int staffId;
	
	private String uname;
	private String pword;
	private String fname;
	private String lname;
	private Status status;
	
	public enum Status{
		ENABLE, DISABLE
	}
	
	public StaffEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StaffEntity(String uname, String pword, String fname, String lname) {
		super();
		this.uname = uname;
		this.pword = pword;
		this.fname = fname;
		this.lname = lname;
		status = Status.DISABLE;
	}
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	
	
	
	
}
