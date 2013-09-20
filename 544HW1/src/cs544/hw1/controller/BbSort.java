package cs544.hw1.controller;

public class BbSort {
	
	public BbSort() {}
	
	
	public int[] bubbleSort(int[] num) {
		
		 for (int i = 1; i < num.length; i++) {
		    for (int j = 0; j < num.length - i; j++) {
		    	
		        if (num[j ] > num[j+1]) {
		            int temp = num[j ];
		            num[j ] = num[j+1];
		            num[j+1] = temp;
		          
		        }
		        
		    }
		  }
		 
		 return num;
		}


}
