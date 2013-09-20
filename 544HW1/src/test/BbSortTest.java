package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import cs544.hw1.controller.BbSort;

public class BbSortTest {

	
	
	BbSort b;
	@Before
	public void setUp() throws Exception {
		
		b = new BbSort();
	}
	
	@Test
	/**
	 * test the bubble sort algorithm
	 */
	public void sortTest() {
		
		int[] num = {9,8,7,6,5,4,3,2,1,11,33,44};
		int[] actual = b.bubbleSort(num);
		int[] expected = {1,2,3,4,5,6,7,8,9,11,33,44};
		//Assert.assertTrue(Arrays.equals(actual, expected));
		//Assert.assertEquals(expected, actual);
		Assert.assertEquals(Arrays.toString(expected),Arrays.toString (actual));
		//assertEquals(Arrays.toString(expected),Arrays.toString (actual));
		;
		
	}
	
	

}
