package com.capgemini.basepackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.basepackage.entity.User;
import com.capgemini.basepackage.exception.LoginError;
import com.capgemini.basepackage.repository.UserRepo;

@Service
public class LoginRegisterImpl implements LoginRegister {

	@Autowired
	private UserRepo repository;
	
	@Override
	public User registration(User user) {
		return repository.save(user);
	}

	@Override
	public User fetchUserByEmailID(String email) {
		return repository.findByUserEmail(email);
	}

	@Override
	public User fetchUserByEmailIDAndPassword(String email, String password) {
		User u=repository.findByUserEmailAndPassword(email, password);
		if(u== null) {
			throw new LoginError("User Not found");
		}
		return u;
	}

}
