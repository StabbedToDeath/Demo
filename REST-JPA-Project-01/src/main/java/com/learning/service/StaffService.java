package com.learning.service;

import java.util.List;

import com.learning.entity.StaffEntity;
import com.learning.entity.StaffEntity.Status;

public interface StaffService {
	
	public StaffEntity createStaff(StaffEntity staff);
	
	public List<StaffEntity> getAllStaff();
	
	public void statusChange(int id, Status status);
	
	public boolean validateStaff(StaffEntity staff);
	
}
