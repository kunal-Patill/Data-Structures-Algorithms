// Kadens Algorithm is the best optimum solution to find the maximum sum subarray in the given array with the best time complaxity that can be possible !!
package placementsArray;

public class kadensAlgorithm {

	public static void main(String[] args) {
// Initialize two variables i.e. maxsum and currentsum to zero and follow the given process 		
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
