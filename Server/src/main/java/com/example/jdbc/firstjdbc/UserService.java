package com.example.jdbc.firstjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	Repouser repo;
	
User getUser(Integer id)
	{
	
		return repo.findById(id).orElse(new User()) ;
	}
}
