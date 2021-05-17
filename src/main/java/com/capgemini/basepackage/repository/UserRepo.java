package com.capgemini.basepackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.basepackage.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByUserEmail(String email);
	public User findByUserEmailAndPassword(String email,String passsword);
}
