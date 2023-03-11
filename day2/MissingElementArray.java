package week1.day2;

import java.util.Arrays;

public class MissingElementArray {

		   // Here is the input
		   // int[] arr = {1,2,3,4,7,6,8};
           // Sort the array	
		   // loop through the array (start i from arr[0] till the length of the array)
           // check if the iterator variable is not equal to the array values respectively
	       // print the number
		   // once printed break the iteration

	public static void main(String[] args) { 
	//syntax- datatype name [] = {value};
		
		         int[] arrayin = {1,2,3,4,7,6,8};
		
	Arrays.sort(arrayin);
		
		 for (int i = 0; i < arrayin.length; i++) {
			
		   if (arrayin[i]!=i+1) {
		 	
			System.out.println(i+1); // Output - 5
			
			break;
			
		  }	
	   }
		
	}

}
