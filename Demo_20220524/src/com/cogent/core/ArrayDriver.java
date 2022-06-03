package com.cogent.core;

import java.util.Scanner;

class CustomerArray {
	
	private int custID;
	private String custName;
	
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
	
	@Override
	public String toString() {
		return "Customer Name - " + custName + " has CustomerID " + custID;
	}
	
}

public class ArrayDriver {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Please enter number of customers to be added: ");
		int len = read.nextInt();
		
		System.out.println();
		System.out.println();
		
		CustomerArray[] customers = new CustomerArray[len];
		
		for (int i = 0; i < len; i++) {
			customers[i] = new CustomerArray();
			System.out.print("Please enter Customer ID: ");
			customers[i].setCustID(read.nextInt());
						
			System.out.print("Please enter Customer Name: ");
			customers[i].setCustName(read.next());
			
			System.out.println();
		}
		
		System.out.println("Printing the list of customers.....\n");
		for(CustomerArray c : customers) {
			System.out.println(c.toString());
		}
		
		read.close();
	}
}
