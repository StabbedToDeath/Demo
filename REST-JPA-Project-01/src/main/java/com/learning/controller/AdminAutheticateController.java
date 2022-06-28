package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.AdminEntity;
import com.learning.service.AdminService;

@RestController
@RequestMapping("/api/admin/autheticate")
public class AdminAutheticateController {
	
	@Autowired
	AdminService service;
	
	@PostMapping
	public ResponseEntity<String> autheticateAdming(@RequestBody AdminEntity admin){
		try {
			if(service.validateAdmin(admin)) {
				return new ResponseEntity<String>("You've logged in!!", HttpStatus.valueOf(200));
			}
		} catch (NullPointerException e) {
			
		}
		return new ResponseEntity<String>(HttpStatus.valueOf(403));
		
	}
	
}
