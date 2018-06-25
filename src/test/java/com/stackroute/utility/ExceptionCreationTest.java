package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionCreationTest {

	@Test
	public void testFirstException() {
		ExceptionCreation ec= new ExceptionCreation();
		String expectedValue ="java.lang.NegativeArraySizeException";
		String actualValue=ec.firstException();
		assertEquals(expectedValue,actualValue);
	}

	@Test
	public void testSecondException() {
		ExceptionCreation ec= new ExceptionCreation();
		String expectedValue ="java.lang.ArrayIndexOutOfBoundsException";
		String actualValue=ec.secondException();
		assertEquals(expectedValue,actualValue);	
		}

	@Test
	public void testThirdException() {
		ExceptionCreation ec= new ExceptionCreation();
		String expectedValue ="java.lang.NullPointerException";
		String actualValue=ec.thirdException();
		assertEquals(expectedValue,actualValue);	
		}

}
