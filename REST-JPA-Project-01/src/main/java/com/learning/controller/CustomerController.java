package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.service.CustomerService;

@RestController
@RequestMapping("/api/staff")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	
	
}
