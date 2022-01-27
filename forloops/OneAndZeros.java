package PatterQuestions;

import java.util.Scanner;
// the above Scanner class helps us to get imput from the user 

public class OneAndZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 		here we have created new object through "new" keyword
		System.out.println("Enter number of rows :");
		int n = sc.nextInt();
		System.out.println("Enter number of columns :");
		int m = sc.nextInt();
// 		above we took input from the user for the number of rows and columns
		
// 		below is an example of nested for loop 
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i==1 || i==m || j==1 || j==n)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}

}


//  the output will look something like this :
		// 111111
		// 100001
		// 100001
		// 111111
