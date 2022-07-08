
public static void mergeSort (int arr[], int l, int r) {
		if(l<r) {
			int mid = l + (r-1)/2;
			mergeSort(arr, l, mid-1);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
