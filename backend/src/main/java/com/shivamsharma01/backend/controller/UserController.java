package com.shivamsharma01.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shivamsharma01.backend.entity.User;
import com.shivamsharma01.backend.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
    @GetMapping("/test")
    public String test() {
        return "test completed";
    }
    
    @GetMapping("/add")
    public String addUser(@RequestParam("name") String name) {
    	User user = new User();
    	user.setName(name);
    	user.setEmail(name+"@gmail.com");
    	userRepository.save(user);
    	return "done";
    }
    
    @GetMapping("/all")
    public Iterable<User> getUsers() {
    	return userRepository.findAll();
    }
}
