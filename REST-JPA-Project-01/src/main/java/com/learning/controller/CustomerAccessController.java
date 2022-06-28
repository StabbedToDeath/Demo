package com.learning.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.AccountEntity;
import com.learning.entity.CustomerEntity;
import com.learning.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerAccessController {
	
	@Autowired
	CustomerService service;
	
	
	@PostMapping("/register")
	public ResponseEntity<CustomerEntity> register(@RequestBody CustomerEntity customer) {
		
		return new ResponseEntity<CustomerEntity>(service.registerCustomer(customer), HttpStatus.CREATED);
	}
	
	@GetMapping("/{customerID}/account")
	public ResponseEntity<List<AccountEntity>> getAllAccounts(@MatrixVariable(pathVar = "customerID") Integer custId){
		return new ResponseEntity<List<AccountEntity>>(service.getAllAccounts(custId), HttpStatus.OK);
	}
	
	@GetMapping("/{customerID}")
	public ResponseEntity<CustomerEntity> getCustomer(@MatrixVariable Integer custID) {
		return new ResponseEntity<CustomerEntity>(service.getCustomer(custID), HttpStatus.OK);
	}
	
	@PutMapping("/{customerID}")
	public ResponseEntity<CustomerEntity> updateCustomer(@MatrixVariable Integer custID, @RequestBody CustomerEntity customer) {
		return new ResponseEntity<CustomerEntity>(service.registerCustomer(customer), HttpStatus.OK);
	}
	
	
	
	
}
