// Here we will use the inbuilt function i.e. Arrays.sort() which would directly sort the given array.
package placementsArray;

import java.util.Arrays;

public class array001122 {

	public static void main(String[] args) {
		
		int a [] = {1,0,2,0,0,1,2,2,1,0};
		
          Arrays.sort(a);
          
          System.out.printf("sorted array is :" +Arrays.toString(a));
	}
}
// Arrays.toString() function helps us to print the array by converting it to a string .
