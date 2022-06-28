package com.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.StaffEntity;

public interface StaffRepository extends JpaRepository<StaffEntity, Integer>{

}
