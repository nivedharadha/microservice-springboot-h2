package com.example.microservice_springboot_h2.microservice_springboot_h2.User.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.microservice_springboot_h2.microservice_springboot_h2.User.User;
import com.example.microservice_springboot_h2.microservice_springboot_h2.User.Exception.UserNotFoundException;
import com.example.microservice_springboot_h2.microservice_springboot_h2.User.Repository.UserRepository;
import com.example.microservice_springboot_h2.microservice_springboot_h2.User.Service.UserService;


@RestController
public class controller {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userService.findAll();
	}

	@GetMapping("/users/{id}")
	public Optional<User> retrieveUser(@PathVariable int id) {
		Optional<User> user = userService.getById(id);
		if(user == null) {
			throw new UserNotFoundException("id:"+id);
		}
		return user;

	}

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User savedUser = userService.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteById(id);
	}

}
