package placementsArray;

public class stockPrice {

	public static int main (String[] args ) {
		
		int prices[] = {7,1,5,3,6,1};
		int minprice = Integer.MAX_VALUE;
		int maxprofit =0;
		
		for(int i=0; i<prices.length; i++) {
			if(prices[i] < minprice) {
				minprice = prices[i];
			}
			else if (prices[i] - minprice > maxprofit) {
				maxprofit = prices[i] - minprice;
			}
		}
		
		return maxprofit;
	}
}
