package com.cogent.core;

import java.util.Arrays;

class Customer {
	
	int custID;
	String custName;
	String custEmail;
	int custMobile;
	char custGender;
	
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public int getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(int custMobile) {
		this.custMobile = custMobile;
	}
	public char getCustGender() {
		return custGender;
	}
	public void setCustGender(char custGender) {
		this.custGender = custGender;
	}
	
	@Override
	public String toString() {
		return "Customer ID: " + custID + "\n" +
				"Customer Name: " + custName + "\n" +
				"Customer Email: " + custEmail + "\n" +
				"Customer Mobile: " + custMobile + "\n" +
				"Customer Gender: " + custGender;
	}
	
	
	
}






public class CustomerDriver {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		customer.setCustName("Pranav");
		customer.setCustID(1);
		customer.setCustMobile(452784125);
		customer.setCustEmail("p@gmail.com");
		customer.setCustGender('M');
		
		System.out.println(customer);
		
		
		int[] arr = {1,5,2,8,0};
		
		System.out.println(Arrays.binarySearch(arr, 1));
		
	}
}
