package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.entity.AdminEntity;
import com.learning.repo.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository repo;
	
	@Override
	public boolean validateAdmin(AdminEntity admin) {
		AdminEntity toBeChecked =  repo.findById(admin.getUname()).get();
		if((toBeChecked == null)) {
			throw new NullPointerException();
		} else {
			if (!(toBeChecked.getPword().matches(admin.getPword()))) {
				//must throw Sign IN Failed Exception
				throw new NullPointerException();
			} 
			return true;
		}
	}

}
