package placementsArray;

import java.util.Arrays;

public class maximumMinimumDiffInArray {

	public static void main(String[] args) {
	
		int k = 2;
		int a [] = {1,5,8,10};
//		Arrays.sort(a);
//		System.out.print("the sorted array is :");
//		for(int i=0; i<a.length; i++) {
//			
//			System.out.print(" "+a[i]);
//		}
//		int ans = a[a.length-1] - a[0];
		int smallest = a[0];
		int largest = a[a.length-1];
		int ans = largest - smallest;
		for(int i=0; i<a.length ;i++) {
			if(a[i]<largest) {
				a[i]=a[i]+k;
			}
			else if (a[i]>largest){
				
			}
		}
		
		
	}

}
