package com.learning.service;

import java.util.List;

import com.learning.entity.AccountEntity;
import com.learning.entity.CustomerEntity;

public interface CustomerService {
	
	
	public CustomerEntity registerCustomer(CustomerEntity customer);
	
	public List<AccountEntity> getAllAccounts(int custId);
	
	public CustomerEntity getCustomer(int custId);
}
