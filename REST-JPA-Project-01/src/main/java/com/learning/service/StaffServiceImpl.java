package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.entity.AdminEntity;
import com.learning.entity.StaffEntity;
import com.learning.entity.StaffEntity.Status;
import com.learning.repo.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	StaffRepository repo;
	
	@Override
	public StaffEntity createStaff(StaffEntity staff) {
		return repo.save(staff);
	}

	@Override
	public List<StaffEntity> getAllStaff() {
		return repo.findAll();
	}

	@Override
	public void statusChange(int id, Status status) {
		StaffEntity staff = repo.findById(id).get();
		staff.setStatus(status);
	}

	@Override
	public boolean validateStaff(StaffEntity toBeChecked) {
		
		if((toBeChecked == null)) {
			throw new NullPointerException();
		} else {
			List<StaffEntity> staffMembers = getAllStaff();
			
			for(StaffEntity staffMember : staffMembers) {
				if(staffMember.getUname().matches(toBeChecked.getUname()) && staffMember.getPword().matches(toBeChecked.getPword())) {
					return true;
				}
			}
			 return false;
		}

	}

	
	
}
