package com.example.program_13;

import com.example.program_13.Entity.Usermaster;
import com.example.program_13.Repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Program13ApplicationTests {

	@Autowired
	private UserRepo userRepo;

	private Usermaster testuser;
	@Test
	void testuserExistsById() {
		// Check if the book with ID 122 exists (the one we've saved in setup())
		boolean exists = userRepo.existsById(123);

		// Assert that the book with ID 122 exists in the database
		assertTrue(exists, "The book with ID 122 should exist");
	}


}
