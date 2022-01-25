//for loops mai .. jo cheez ko repeat karna hota hai vahi loop mai aati hai 
//aur jo condition hoti hai vo badmai curly bracket mai likhte hai 


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
