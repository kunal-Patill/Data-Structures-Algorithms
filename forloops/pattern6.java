// This program helps to print a desired pattern :

public static void main(String[]args) {
int n=5;
for(int i=1;i<=n;i++) {
for(int j=1;j<=n;j++) {
if(i==1 || j==1 || i==n || j==n)
System.out.print("1 ");
else
System.out.print("0 ");
}
System.out.println();
}
}


output for the given code is :
1 1 1 1 1 
1 0 0 0 1 
1 0 0 0 1 
1 0 0 0 1 
1 1 1 1 1 
