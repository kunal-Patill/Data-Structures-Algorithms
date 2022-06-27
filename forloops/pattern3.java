import java.util.Scanner;

public static void main(String[]args){
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
  
  //This code helps in printing the following pattern:
  // 1
  // 1 2
  // 1 2 3
  // 1 2 3 4
  // 1 2 3 4 5   and so on.....
