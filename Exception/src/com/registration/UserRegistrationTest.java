package com.registration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	public void testEmail() throws Exception {
		Scanner scn = new Scanner(System.in);
		UserRegistration u = new UserRegistration();
		
		System.out.println("Enter your email");
		String email = scn.next();
		boolean em = u.emailTest(email);
		Assert.assertEquals(em, true);
		
		System.out.println("Enter your password");
		String password = scn.next();
		boolean pass = u.passTest(password);
		Assert.assertEquals(pass, true);
		
		System.out.println("Enter your mobile number");
		String mobile = scn.next();
		boolean mob = u.mobTest(mobile);
		Assert.assertEquals(mob, true);

	}
}
