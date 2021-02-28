package com.example.jdbc.firstjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@Autowired
	UserService user;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(path="/hello")
	public User hello(@RequestParam("id") Integer id)
	{
		return user.getUser(id);
	}
	
}
