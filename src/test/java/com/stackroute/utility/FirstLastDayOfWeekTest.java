package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstLastDayOfWeekTest {

	@Test
	public void testGetFirstDayOfWeek() {
		FirstLastDayOfWeek obj = new FirstLastDayOfWeek();
		String expectedValue ="Mon 18/06/2018";
		String actualValue = obj.getFirstDayOfWeek();
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testGetLastDayOfWeek() {
		FirstLastDayOfWeek obj = new FirstLastDayOfWeek();
		String expectedValue ="Sun 17/06/2018";
		String actualValue = obj.getLastDayOfWeek();
		assertEquals(expectedValue, actualValue);
	}

}
