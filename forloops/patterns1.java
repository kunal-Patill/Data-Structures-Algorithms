// Pattern questions are basically the questions in which we are required to print a pattern asked to us
package forloops;

import java.util.Scanner;
public class patterns1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);		
		System.out.println("enter the number ");
		int n = sc.nextInt();
		
		for(int j=1; j<=n ; j++) {
		    
			System.out.println();
			
		for(int i=1 ; i<=n ; i++) {
			System.out.print(" * ");
		}

	}

	}
	
}

// The pattern of above code (if n = 5) is as follows :
*****
*****
*****
*****
*****
		
