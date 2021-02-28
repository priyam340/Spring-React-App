package com.example.jdbc.firstjdbc;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<String> getUsers() {
		// TODO Auto-generated method stub
		List<String> user=new ArrayList<String>();
		user.addAll(jdbcTemplate.queryForList("select name from test;",String.class));
		return user;
	}

}
