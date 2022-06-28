package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.StaffEntity;
import com.learning.service.StaffService;

@RestController
@RequestMapping("/api/staff/autheticate")
public class StaffAutheticateController {

	@Autowired
	StaffService service;
	
	public ResponseEntity<String> validateStaff(@RequestBody StaffEntity staff) {
		
		try {
			if(service.validateStaff(staff)) {
				return new ResponseEntity<String>("You've logged in!!", HttpStatus.valueOf(200));
			}
		} catch (NullPointerException e) {
			
		}
		return new ResponseEntity<String>(HttpStatus.valueOf(403));
		
	}
	
	
}



