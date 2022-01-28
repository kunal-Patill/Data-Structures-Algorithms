// This code is used for rotating the matrix 
package placementsArray;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		
		while(true) {
//			left wall
			for(int i=minr; i<maxr; i++) {
				System.out.println(arr[i][minc]);				
			}
//			bottom wall
			
		}

	}

}
