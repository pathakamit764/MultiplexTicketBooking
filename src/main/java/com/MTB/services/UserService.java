package com.MTB.services;

import com.MTB.entites.Users;

public interface UserService {
	Users fetchUserByEmailId(String tempEmailId);

	Users saveUser(Users user);

	Users fetchUserByEmailIdAndPassword(String tempEmailId, String tempPass);

	public Users getUserByEmail(String email);

	Users getUserByEmail1(String email);
}
