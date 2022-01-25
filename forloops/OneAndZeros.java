package PatterQuestions;

import java.util.Scanner;

public class OneAndZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int n = sc.nextInt();
		System.out.println("Enter number of columns :");
		int m = sc.nextInt();
		
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
