package com.rkrahul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkrahul.component.UserData;
import com.rkrahul.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<UserData> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<UserData> getUser(long id) {
		return userRepository.findById(id);
	}

	public String addUser(UserData user) {
		userRepository.save(user);
		return "User added successfully";
	}
	
	public String updateUser(long id, UserData user) {
		userRepository.save(user);
		return "User is updated sucessfully";
	}

	public String deleteUser(long id) {
		userRepository.deleteById(id);
		return "User deleted successfully";
	}
	

}
