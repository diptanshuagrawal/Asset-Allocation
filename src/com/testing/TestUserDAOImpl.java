package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dao.impl.UserDAOImpl;
import com.pojo.User;

class TestUserDAOImpl {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testaddUser_Positive() {
	UserDAOImpl dao= new UserDAOImpl();
	int expected = 1;
	User user = new User("abc@gmail.com", "Mridula", "q1w2");
	int act_res = dao.addUser(user);
	assertEquals(expected, act_res);
	}
	
	@Test
	void testaddUser_Negative() {
		UserDAOImpl dao= new UserDAOImpl();
		int expected = 0;
		User user = new User("abc@gmail.com", "Mridula", "q1w2");
		int act_res = dao.addUser(user);
		assertEquals(expected, act_res);
	}

}
