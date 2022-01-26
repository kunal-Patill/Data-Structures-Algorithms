package placementsArray;
//geeks for geeks var kela apn ha complete :)
public class merge2arrays {

	public static void main(String[] args) {
		
		int a [] = {1,3,5,10};
		int b [] = {2,8};
		int c[]= new int [a.length + b.length];
    	int temp;
		
//		for (int i=0; i<a.length; i++) {
//			for (int j=0; j<b.length; j++) {
//			
//				
//				if(a[i]<b[i]) {
//					i++;
//				}
//				else if (a[i+1]>b[j]) {
//					temp = a[i+1];
//					a[i+1]= b[j];
//					b[j] = temp;
//				}
//			}
//		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++ ) {
				for(int k=0 ; k<c.length; k++) {
				if(a[i]<b[j]) {
					c[k] = a[i];
					i++;
				}
				else {
					c[k] = b[j];
					j++;
				}					
			}
		}
			
		}
		
		System.out.println();

	}

}
