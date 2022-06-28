import java.util.Scanner;

public static void main(String[]args){
  Scanner sc= new Scanner(System.in);
  int n = sc.nextInt();
  for(int i=0;i<n;i++) {
  System.out.println();
  for(int j=n;j>i;j--) {
  System.out.print("* ");
  	}
  }
  }


// The above program generates the following pattern :
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
