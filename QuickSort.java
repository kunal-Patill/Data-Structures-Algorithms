//The below given code can be used for quick sorting technique :

public static void main(String[]args) {
		int arr[] = {4,2,8,12,9,3,15,6,1};
		int l=0; int r = arr.length-1;
		quick(arr, l, r);
		for(int i: arr) {
			System.out.print(arr[i]);
		}
	}
  
public static void quick(int arr[], int l, int r) {
		while(l<r) {
			int pivot = partation(arr, l, r);
			quick(arr, l, pivot -1);
			quick(arr, pivot+1, r);
		}
	}
	
public static int partation(int arr[], int l, int r) {
		int pivot = l;
		int i=0;
		int j=r;
		while(i<j) {
			while(arr[i]<=pivot)i++;
			while(arr[j]>=pivot)j++;
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[pivot];
		arr[pivot] = temp;
		
		return j;
	}
