package forloops;

import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for(int j = 1; j<=n ; j++) {
		
			System.out.println("");
			
//		for(int i =1; i<=n ; i++) {	
			
		for(int i =1 ; i<= n-j ; i++) {
			
			System.out.print("* ");
		}


	}
	
  }
}
