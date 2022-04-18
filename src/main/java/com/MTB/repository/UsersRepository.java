package com.MTB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MTB.entites.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	public Users findByEmailId(String emailId);
	public Users findByEmailIdAndPassward(String emailId,String passward);
	
}