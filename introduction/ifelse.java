package introduction;

import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the first number");
		int a = sc.nextInt();
		
		System.out.println("enter the second number");
		int b = sc.nextInt();
		
		System.out.println("enter the third number");
		int c = sc.nextInt();
		
	    
		if(a>b && a>c) {
			System.out.println("first no is greatest");
		}
		else if (b>a && b>c) {
			System.out.println("second no is greatest");
		}
		else {
			System.out.println("third no is the greatest");
		}

	}
}
