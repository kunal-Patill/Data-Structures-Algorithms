package introduction;

import java.util.Scanner;
//  this class is used for getting input from the user 

public class firstcode {
// 	   this is the main class of our first code
	
	public static void main(String[] args) {
//	       basic syntax for starting a code in java
		
		Scanner sc = new Scanner (System.in);
//		from above statement user input process starts i.e. scanner
		
		System.out.println("enter the value of principal");
//		above statement is used for printing data on our screen
		
		int principal = sc.nextInt();
//		above statement is eg. of taking integer value from user
		System.out.println("enter the value of rate");
		
		float rate = sc.nextFloat();
				System.out.println("enter the value of time");
		
		int time = sc.nextInt();
		
		float simpleIntrest = principal * rate* time / 100;
//		    here simpleIntrest variable is wrote in camelcase format ..which is to be followed everywhere
//                  also remember java is a case sensative language  
	   
		System.out.println("the simple intrest is " + simpleIntrest);
		
	}

}
