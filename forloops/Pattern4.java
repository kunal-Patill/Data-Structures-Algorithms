import java.util.Scanner;

public static void main(String[]args){
  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt():
  
//   outer loop for rows :
  for(int i=0; i<n; i++){
//     inner loop for spaces :
    for(int j=n-i; j>1;j++){
      System.out.print(" ");
      }
//     final inner loop for printing *:
    for(int j=0; j<=i; j++){
      System.out.print("* ")  
      }
//     print Statement for next line :
    System.out.println();
    }
  }
