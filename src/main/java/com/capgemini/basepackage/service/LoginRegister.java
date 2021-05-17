package com.capgemini.basepackage.service;

import com.capgemini.basepackage.entity.User;

public interface LoginRegister {

	public User registration(User user);

	public User fetchUserByEmailID(String email);

	public User fetchUserByEmailIDAndPassword(String email, String password);
}
