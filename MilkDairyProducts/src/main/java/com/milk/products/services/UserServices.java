package com.milk.products.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.milk.products.pojo.User;
import com.milk.products.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUser(String user_id) {
		return userRepository.findById(user_id);
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public void updateUser(User user, String user_id) {
		userRepository.save(user);
	}
	
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
}
