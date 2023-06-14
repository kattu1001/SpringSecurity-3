package com.example.in.service;

import java.util.Optional;

import com.example.in.entity.User;

public interface UserService {

	public User saveUser(User user);
	public Optional<User> findByUsername(String username);
	
}
