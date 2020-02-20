package com.openshift.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.openshift.demo.model.User;
import com.openshift.demo.repository.UserRepository;
import com.openshift.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
