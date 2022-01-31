// Kadens Algorithm is the best optimum solution to find the max sum subarray in the gicen array 
package placementsArray;

public class kadensAlgorithm {

	public static void main(String[] args) {
		
		int a[] = {5,-4,-2,6,-1,8};
		int maxsum = 0;
		int cursum = 0;
		
		for(int i=0; i<a.length; i++) {
			cursum = cursum + a[i];
			if(maxsum<cursum) {
				maxsum = cursum;
			}
			if(cursum<0) {
				cursum = 0;
			}
		}
		System.out.println("the sum is ");
//		for (int i : a) {
			System.out.print( maxsum);
//		}

	}

}
