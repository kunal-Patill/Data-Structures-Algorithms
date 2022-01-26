package placementsArray;

import java.util.Arrays;

//wapis karenge ye code ********
//this is the traversing of array method as it reduces the time complexity , instead of using sorting method

public class minimumAndMaximumInArray {

	public static void main(String[] args) {
	
		int array []= {12,2,34,1,49,12, 21};
		
//		int min = array[0];
//		int max = array[0];
//		
//		for (int i=0 ; i<=array.length- 1; i++) {
//			
//			if(array[i]> min) {
//				min = array[i];
//			}
//			if(array[i]< max) {
//				max = array[i];
//			}
//			
//			System.out.println("minimum is :"+ min + "maximum is : "+ max);
//		}
		Arrays.sort(array);
		System.out.println("the min element is :"+ array[0] + "the maximum element is :" + array[array.length-1]);

    }
	
}
