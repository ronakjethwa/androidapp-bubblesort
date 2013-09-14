package cs544.hw1.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Validator {

	public Validator () {}
	
	public static String OUT_OF_RANGE_ERROR = "Please inter number in the range of 1- 100",
						 UNIQUNESS_ERROR = "All numbers must be unique",
						 SIZE_TEST = "ypu should inter 10 to 12 numbers";
	
	
	public void validate (int[] arrayofNums) throws Exception {
		
		if (arrayofNums.length< 10 || arrayofNums.length >12  ) {
			throw new Exception(SIZE_TEST) ;
		}
		
		Set<Integer> uniqueNums = new HashSet<Integer>();
	
		for(int a:arrayofNums) {
		
			if (a<1 || a>100) {
				throw new Exception(OUT_OF_RANGE_ERROR);				
			}
			
			uniqueNums.add(a);
		}
	
		if (uniqueNums.size() != arrayofNums.length) {
			throw new Exception(UNIQUNESS_ERROR);
		}
	}
	
	
}
