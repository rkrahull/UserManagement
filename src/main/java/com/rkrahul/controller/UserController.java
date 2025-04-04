package com.rkrahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rkrahul.component.UserData;
import com.rkrahul.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<UserData> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public UserData getUser(@PathVariable long id) {
		return userService.getUser(id).get();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="users")
	public String addUser(@RequestBody UserData user) {
		return userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="users/{id}")
	public String updateUser(@PathVariable long id, @RequestBody UserData user) {
		return userService.updateUser(id, user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="users/{id}")
	public String deleteUser(@PathVariable long id) {
		return userService.deleteUser(id);
	}

}
