package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.StaffEntity;
import com.learning.service.StaffService;

@RestController
@RequestMapping("/api/admin/staff")
public class AdminAccessController {
	
	@Autowired
	StaffService service;
	
	@PostMapping
	public ResponseEntity<StaffEntity> addStaff(@RequestBody StaffEntity staff){
		return new ResponseEntity<StaffEntity>(service.createStaff(staff), HttpStatus.valueOf(200));
	}
	
	@GetMapping
	public ResponseEntity<List<StaffEntity>> getAllStaff(){
		return new ResponseEntity<List<StaffEntity>>(service.getAllStaff(), HttpStatus.valueOf(200));
	}
	
	@PutMapping
	public ResponseEntity<HttpStatus> changeStatus(@RequestBody StaffEntity staff){
		service.statusChange(staff.getStaffId(), staff.getStatus());
		return new ResponseEntity<HttpStatus>(HttpStatus.valueOf(200));
		//can have error - try catch block. 
	}
}
