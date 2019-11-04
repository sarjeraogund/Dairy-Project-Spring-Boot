package com.milk.products.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.milk.products.exception.ResourceNotFoundException;
import com.milk.products.pojo.User;
import com.milk.products.services.UserServices;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServices userServices;
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return userServices.getAllUsers();		
	}
	
	@GetMapping("/all/{user_id}")
	public ResponseEntity<User> getUser(@PathVariable String user_id) throws ResourceNotFoundException {
		User user = userServices.getUser(user_id).orElseThrow(() -> new ResourceNotFoundException("User not found this id: "+user_id));
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping("/insert")
	public User saveUser(@RequestBody User user) {
		return userServices.addUser(user);
	}
	
	@PutMapping("/update/{user_id}")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User userdetails,@PathVariable String user_id) throws ResourceNotFoundException {
		User user = userServices.getUser(user_id).orElseThrow(() -> new ResourceNotFoundException("User not found this id: "+user_id));
		
		user.setFull_name(userdetails.getFull_name());
		user.setEmail_id(userdetails.getEmail_id());
		user.setMobile_no(userdetails.getMobile_no());
		user.setGender(userdetails.getGender());
		user.setDob(userdetails.getDob());
		final User updateUser = userServices.addUser(user);
				
		return ResponseEntity.ok().body(updateUser);
	}
	
	@DeleteMapping("/delete/{user_id}")
	public Map<String, Boolean> deleteUser(@PathVariable String user_id) throws ResourceNotFoundException {
		User user = userServices.getUser(user_id).orElseThrow(() -> new ResourceNotFoundException("User not found this id: "+user_id));
		
		userServices.deleteUser(user);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return response;
	}
	
}
