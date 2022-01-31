//Here you can find the function method 
package placementsArray;

public class kadensAlgorithm2 {

	public static int main(String[] args) {
		
		int a[] = {5,-4,-2,6,-1,7};
		int ans = KadAlg(a);
	}
	
	Static int KadAlg(int arr[]){
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
		return maxsum;
		}
}
