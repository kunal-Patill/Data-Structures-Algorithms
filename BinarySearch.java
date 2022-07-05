// This is a itervative code for binary search :

public static void main(String []args) {
		int arr[] = {10,2,15,5,7,1,3,4,19,12};
		Arrays.sort(arr);
		int x =19; 
		int l = 0; int h = arr.length-1;
		int ans = bin(arr, x, l, h);
		if(ans == x) {
			System.out.println("Element is persent ");
		}
		else 
			System.out.println("element is not present");
	}
	
	public static int bin(int arr[], int x, int l, int h) {
		if(h>=0) {
			int mid = 1+(h-1)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x) {
				return bin(arr, x, l, mid-1);
			}
			else {
				return bin(arr, x, mid+1, h);
			}
		}
		return -1;
	}
