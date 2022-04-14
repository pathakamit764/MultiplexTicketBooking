package com.MTB.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersRepository repo;

	public Users saveUser(Users user) {
		return repo.save(user);
	}

	public Users fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}

	public Users fetchUserByEmailIdAndPassword(String emailId, String passward) {
		return repo.findByEmailIdAndPassward(emailId, passward);
	}

	@Override
	public Users getUserByEmail(String email) {
		Users user = repo.findByEmailId(email);
		if(user!=null) {
		return user;
	}
		else {
			return  null;
		}
	}
}
