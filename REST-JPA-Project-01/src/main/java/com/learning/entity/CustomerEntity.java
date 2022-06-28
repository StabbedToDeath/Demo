package com.learning.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	
	private String fname;
	private String lname;
	
	private String uname;
	private String pword;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "cust_acc_tbl", joinColumns = @JoinColumn(name = "custId"))
	List<AccountEntity> accounts;

	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public CustomerEntity(String fname, String lname, String uname, String pword, List<AccountEntity> accounts) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.pword = pword;
		this.accounts = accounts;
	}

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}

	public List<AccountEntity> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountEntity> accounts) {
		this.accounts = accounts;
	}
	
	
	
	
	
	
}
