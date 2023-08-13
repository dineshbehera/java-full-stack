package com.oned.bookstore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oned.bookstore.dao.UserRepository;
import com.oned.bookstore.model.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("users")
public class UserController {
	
	Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping({"","/"})
	public List<User> getUsers() {
		LOGGER.info("request received GET getUsers()");
		return userRepository.findAll();
	}
	
	@GetMapping(path = { "/{id}" })
	public User getUserById(@PathVariable("id") long id) {
		LOGGER.info("request received GET getUserById({})",id);
		User user = userRepository.getById(id);
		return user;
	}
	
	@PostMapping("/")
	public void createUser(@RequestBody User user) {
		LOGGER.info("request received createUser({})",user);
		userRepository.save(user);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public User deleteUser(@PathVariable("id") long id) {
		LOGGER.info("request received deleteUser({})",id);
		User user = userRepository.getOne(id);
		userRepository.deleteById(id);
		return user;
	}

}
