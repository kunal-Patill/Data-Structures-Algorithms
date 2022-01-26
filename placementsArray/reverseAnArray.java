package placementsArray;

public class reverseAnArray {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5};
		System.out.println("the original array is :");
		for(int i=0 ; i<=array.length-1 ; i++) {
		System.out.print( array[i] + " ");
		}
		
		System.out.println();
		System.out.println("the reversed array is :");
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	
}
