// This porgram helps in printing a pattern:
import java.util.Scanner;

public static void main(String[]args){
  // Scanner takes input from the user for the number of rows  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows :");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++){
    System.out.println();
    for(int j=1;j<=i;j++){
      System.out.print(j+" ");
      }
    }
  }
  
  //The following pattern is printed :
  // 1
  // 1 2
  // 1 2 3
  // 1 2 3 4
  // 1 2 3 4 5   
  // and so on.....
