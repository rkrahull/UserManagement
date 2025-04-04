package com.rkrahul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>(Arrays.asList(
									new User(1,"Rahul",500),
									new User(2,"Rohit",400),
									new User(3,"Raunak",300)
											));
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public Optional<User> getUser(long id) {
		return users.stream().filter(usr-> usr.getUserId()==id).findFirst();
	}

	public String addUser(User user) {
		users.add(user);
		return "User added successfully";
	}
	
	public String updateUser(long id, User user) {
		for(User usr : users) {
			if(usr.getUserId()==id) {
				usr.setUserName(user.getUserName());
				usr.setSalary(user.getSalary());
				return "User is updated sucessfully";
			}
		}
		return "User is not updated, Please check";
	}

	public String deleteUser(long id) {
		users.removeIf(user->user.getUserId()==id);
		return "User deleted successfully";
	}
	

}
