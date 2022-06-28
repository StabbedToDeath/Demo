package com.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, String> {

}
