package introduction;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the first number ");
		int a = sc.nextInt();
		
		System.out.println("enter the second number ");
		int b = sc.nextInt();
		
		System.out.println(" enter the operation to be performed");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0); 
		
		int result = 0;
		
		switch(operation) {
		
		case '+' :
			result = a+b;
			break;
		case '-' :
			result = a-b;
			break;
		case '*' :
			result = a*b;
			break;
		case '/' :
			result = a/b;
			break;
			
			default :
				System.out.println("invalid operation entered");
				
		}
		
		System.out.println("the result is "+ result);
				
	}

}
