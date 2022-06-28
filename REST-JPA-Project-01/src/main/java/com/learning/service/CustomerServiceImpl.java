package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.entity.AccountEntity;
import com.learning.entity.CustomerEntity;
import com.learning.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository repo;
	
	
	@Override
	public CustomerEntity registerCustomer(CustomerEntity customer) {
		return repo.save(customer);
	}
	
	@Override
	public List<AccountEntity> getAllAccounts(int custId) {
		return repo.findById(custId).get().getAccounts();
	}

	@Override
	public CustomerEntity getCustomer(int custId) {
		return repo.findById(custId).get();
	}

}
