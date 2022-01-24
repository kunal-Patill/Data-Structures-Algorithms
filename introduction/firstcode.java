package introduction;

import java.util.Scanner;
//user input sathi hi file use keli jate 

public class firstcode {
//         firstcode ha main public class ahe
	
	public static void main(String[] args) {
//	       basic syntax for starting a code in java
		
		Scanner sc = new Scanner (System.in);
//		above statement ne use input process suru hote i.e. scanner
		
		System.out.println("enter the value of principal");
//		statement print karaila use hota 
		
		int principal = sc.nextInt();
//		above statement is eg of taking integer value from user
		System.out.println("enter the value of rate");
		
		float rate = sc.nextFloat();
				System.out.println("enter the value of time");
		
		int time = sc.nextInt();
		
		float simpleIntrest = principal * rate* time / 100;
//		    ikde simpleIntrest ha variable camelcase format made lihila ahe..which is to be followed everywhere
	   
		System.out.println("the simple intrest is " + simpleIntrest);
		
	}

}
