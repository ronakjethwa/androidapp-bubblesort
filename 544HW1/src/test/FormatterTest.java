package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cs544.hw1.controller.Formatter;

public class FormatterTest {

	Formatter formatter;
	
	@Before
	public void setUp() throws Exception {
		
		formatter = new Formatter();
	}

	/**
	 * Space-separated numbers passed in
	 * @throws Exception
	 */
	@Test
	public void testValidInput() throws Exception {

		int[] actual = formatter.format("1 2 3 4");
		int[] expected = {1, 2, 3, 4};
		Assert.assertArrayEquals(expected, actual);
	}
	
//	/**
//	 * Empty string cannot be parsed
//	 */
//	@Test
//	public void testEmptyString() {
//	
//		try {
//			formatter.format("");
//		}
//		catch(Exception e) {
//			Assert.assertEquals(Formatter.EMPTY_STRING_ERROR, e.getMessage());
//		}
//	}
//	
//	/**
//	 * Input value does not parse to number; only numbers accepted
//	 */
//	@Test
//	public void testNotNumbers() {
//		
//		try {
//			formatter.format("a b c d");
//		}
//		catch(Exception e) {
//			Assert.assertEquals(Formatter.PARSE_ERROR, e.getMessage());
//		}
//	}
//	
//	/**
//	 * Tests non-space delimiter; method accepts only space
//	 */
//	@Test
//	public void testInvalidSeparator() {
//				
//		try {
//			formatter.format("1-2-3-4");
//		}
//		catch(Exception e) {
//			Assert.assertEquals(Formatter.PARSE_ERROR, e.getMessage());
//		}
//	}
}
