package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionCreationTest {

	@Test(expected = NegativeArraySizeException.class)
	public void testFirstException() {
		ExceptionCreation ec= new ExceptionCreation();
		ec.firstException();
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testSecondException() {
		ExceptionCreation ec= new ExceptionCreation();
		ec.secondException();
	}

	@Test(expected = NullPointerException.class)
	public void testThirdException() {
		ExceptionCreation ec= new ExceptionCreation();
		ec.thirdException();
	}

}
