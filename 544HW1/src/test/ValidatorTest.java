package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cs544.hw1.controller.Validator;

public class ValidatorTest {

	
	private Validator v ;
	@Before
	public void setUp() throws Exception {
		
		v = new  Validator();
	}

	
  @Test
  /**
   * Test Validate 
   * Throw exception on invalid input no asserts
   * @throws Exception
   */
  public void testSuccess () throws Exception {
	  
	  
	  int [] a = {1,2,3,4,5,6,7,8,9,10,11,12};
	  v.validate(a);
	  
  }
  
  
  @Test
  public void testInvalidRange() throws Exception{
	  
	  int [] a =  {0,9,8,7,6,101,400,-1,6,4,65,34};
	  try{
	  v.validate(a);
	  	Assert.fail(" Should fail because of the out side of the range");
	  }
	  
	  catch(Exception e){
		  Assert.assertEquals(Validator.OUT_OF_RANGE_ERROR, e.getMessage());
		  
	  }
	  }
  
  /**
   * Should throw exception if all numbers are not unique
   * @throws Exception
   */
  @Test
  public void testUnique() throws Exception {
	  
	  int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11};
	  
	  try {
		  v.validate(a);
		  Assert.fail("Should fail if inputs are not unique");
	  }
	  catch(Exception e) {
		  Assert.assertEquals(Validator.UNIQUNESS_ERROR, e.getMessage());
	  }
  }
  
  @Test
  
  public void testArraySizeTooSmall () throws Exception {
	  
	  int[] a = {1};
	  
	  try {
		  
		  v.validate(a);
		  junit.framework.Assert.fail("Please enter 10 to 12 numbers");
		  
	  }
	  
	  catch (Exception e) {
		  
		  Assert.assertEquals(Validator.SIZE_TEST,e.getMessage());  
			  
	  }
	 }
  @Test
  public void testArraySizeTooLarg () throws Exception {
	  
	  int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	  
	  try {
		  
		  v.validate(a);
		  Assert.fail("Please enter 10 to 12 numbers");
		  
	  }
	  
	  catch (Exception e) {
		  
		  Assert.assertEquals(Validator.SIZE_TEST,e.getMessage());  
			  
	  }
	 }
	  
}

