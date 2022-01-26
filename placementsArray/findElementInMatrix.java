package placementsArray;
import java.util.Scanner;
public class findElementInMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the dimensions");
		int n = sc.nextInt();
		int mat[][]= new int[n][n];
		
		System.out.println("enter the digits");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter the element to be found :");
		int x = sc.nextInt();
		int b = mat[0].length-1;
		
		int i = 0;
		int j = mat[0].length-1;
		while(i<mat.length && j>=0) {
			if(x == mat[i][j]) {
				System.out.println(mat[i][j]);
			}
			else if(x <mat[i][j]) {
				j--;
			}
			else if(x >mat[i][j]){
				i++;
			}
		}
		System.out.println("element not found");

	}

}
