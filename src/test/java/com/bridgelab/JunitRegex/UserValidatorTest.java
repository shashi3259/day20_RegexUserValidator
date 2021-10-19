package com.bridgelab.JunitRegex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

	@Test
	public void givenFirstNameWhenProperReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("Shashi");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenFirstNameWhenImProperReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("eclipse");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenLastNameWhenProperReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("Shashi");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenLastNameWhenImProperReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateLastName("Thakur@");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenEmailWhenProperReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmail("shashithakur@gmail.com");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenEmailWhenImProperReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmail("Thakur@");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenMobileNumberWhenProperReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateMobile("8709544546");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenMobileNumberImProperReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateMobile("870954454");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPasswordWhenProperReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("A@a6abcd");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenPasswordImProperReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validatePassword("A@gjbdb");
		Assert.assertEquals(false, result);
	}

}
