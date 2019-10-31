package com.milk.products.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.milk.products.pojo.User;
import com.milk.products.services.UserServices;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserServices userServices;
	
	@RequestMapping("/users")
	public List<User> getAllUsers(){
		return userServices.getAllUsers();		
	}
	
	@RequestMapping("/users/{user_name}")
	public Optional<User> getUser(@PathVariable String user_name) {
		return userServices.getUser(user_name);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void saveUser(@RequestBody User user) {
		userServices.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{user_id}")
	public void updateUser(@RequestBody User user,@PathVariable String user_id) {
		userServices.updateUser(user,user_id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{user_name}")
	public void deleteUser(@RequestBody User user,@PathVariable String user_name) {
		userServices.deleteUser(user_name);
	}
	
}
