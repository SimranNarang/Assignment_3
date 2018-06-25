package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentMarksTest {

	@Test
	public void testGradeStudents() {
		StudentMarks studentMarks = new StudentMarks();
		char[] expectedValue= {'A','B','C','F'};
		char[] actualValue =  studentMarks.gradeStudents(new int[]{99,75,46,12});
		assertArrayEquals(expectedValue, actualValue);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testForIllegalArgumentException() {
		StudentMarks studentMarks = new StudentMarks();
		studentMarks.gradeStudents(new int[]{110,75,46,12});
	}
	

}
