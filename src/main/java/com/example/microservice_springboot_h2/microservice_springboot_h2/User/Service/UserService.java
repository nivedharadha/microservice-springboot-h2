package com.example.microservice_springboot_h2.microservice_springboot_h2.User.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservice_springboot_h2.microservice_springboot_h2.User.User;
import com.example.microservice_springboot_h2.microservice_springboot_h2.User.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public Optional<User> getById(long id){
		Optional<User> user =  userRepository.findById(id);
		return user;
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public void deleteById(long id){
		userRepository.deleteById(id);
	}

}
