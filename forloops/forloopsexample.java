// The statement which you want to repeat is needed to be mentioned inside for loop and the conditions are mentionde inside the curly brackets
// First part of condition is initialization ... second part is till where you want to run the condition ... and the third part is which fashion you want to iterate 


package forloops;
import java.util.Scanner;

public class forloopsexample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number ");
		
		int a = sc.nextInt();
		
		System.out.println("enter raise to times ");
		
		int b = sc.nextInt();
		
		int answer = 1;
		
		for(int i=0 ; i<b ; i++) {
			
			answer = answer * a;
		}
		
		System.out.println("the answer is " + answer);
	}

}
