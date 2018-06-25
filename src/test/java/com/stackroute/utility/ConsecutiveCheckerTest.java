package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsecutiveCheckerTest {

	@Test
	public void testIsConsecutive() {
		ConsecutiveChecker consecutiveChecker = new ConsecutiveChecker();
		boolean expectedValue = true;
		boolean actualValue = consecutiveChecker.isConsecutive("54,53,52,51,50,49,48");
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testIsNotConsecutive() {
		ConsecutiveChecker consecutiveChecker = new ConsecutiveChecker();
		boolean expectedValue = false;
		boolean actualValue = consecutiveChecker.isConsecutive("1,2,3,4,5,6,6");
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testNotConsecutive() {
		ConsecutiveChecker consecutiveChecker = new ConsecutiveChecker();
		boolean expectedValue = false;
		boolean actualValue = consecutiveChecker.isConsecutive("98,96,95,94,93");
		assertEquals(expectedValue, actualValue);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIIlegalArgument() {
		ConsecutiveChecker consecutiveChecker = new ConsecutiveChecker();
		consecutiveChecker.isConsecutive("aa,96,95,94,93,99,88");
	}
	

}
