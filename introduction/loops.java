package introduction;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number ");
		
        int n = sc.nextInt();
        
        int factorial = 1;
        
        for(int i =n; i>=1 ; i--) {
        	
        	factorial = factorial * i;
        }
		System.out.println("the factorial is "+factorial);
	}
	
}
