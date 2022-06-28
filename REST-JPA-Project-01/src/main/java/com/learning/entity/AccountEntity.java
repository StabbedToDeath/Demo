package com.learning.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	
	private double balance;
	private String approved;
	private enum accType{
		SB,
		CA
	}
	private Date date;
	public AccountEntity(double balance, String approved, Date date) {
		super();
		this.balance = balance;
		this.approved = approved;
		this.date = date;
	}
	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//private int custId;
	
	
	
}
