package com.stackroute.utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveVowelsTest {

	@Test
	public void testRemovingVowels() {
		RemoveVowels remove = new RemoveVowels();
		String[] expectedValue= {"nd","S","Rss","qwrtyp"};
		String[] actualValue = remove.removingVowels(new String[]{"India","USA","Russia","qwertyuiop"});
		assertArrayEquals("Comparing Altered Places!", expectedValue, actualValue);
	}

}
