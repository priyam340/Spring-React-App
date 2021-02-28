package com.example.jdbc.firstjdbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
class FirstjdbcApplicationTests {

	@Autowired
	private UserController user;
	
	@MockBean
	private UserRepo repo;
	
	@Test
	public void getUser()
	{
		List<String> ls=Arrays.asList("oks","ko");
		
		when(repo.getUsers()).thenReturn(ls.stream().collect(Collectors.toList()));
	    assertEquals(1,user.hello().size());
	}
	
	@Test
	void contextLoads() {
		
	}

}
