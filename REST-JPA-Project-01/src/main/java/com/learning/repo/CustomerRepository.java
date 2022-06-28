package com.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{

}
