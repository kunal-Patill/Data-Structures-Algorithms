// This code is used to print a pattern 

public static void main(String[]args) {
	int n=5; 
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			int sum = 0;
			sum=i+j;
			if(sum%2 == 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();
	}
	}


// Output for the above program is :
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
