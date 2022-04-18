package com.MTB.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTB.entites.Users;
import com.MTB.repository.UsersRepository;
import com.MTB.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersRepository repo;

	public Users saveUser1(Users user) {
		return repo.save(user);
	}

	public Users fetchUserByEmailId1(String email) {
		return repo.findByEmailId(email);
	}

	public Users fetchUserByEmailIdAndPassword1(String emailId, String passward) {
		return repo.findByEmailIdAndPassward(emailId, passward);
	}

	@Override
	public Users getUserByEmail1(String email) {
		Users user = repo.findByEmailId(email);
		if(user!=null) {
		return user;
	}
		else {
			return  null;
		}
	}

	@Override
	public Users fetchUserByEmailId(String tempEmailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users fetchUserByEmailIdAndPassword(String tempEmailId, String tempPass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
