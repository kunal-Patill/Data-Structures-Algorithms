// Initial function that calls recursive merge function :

public static void mergeSort (int arr[], int l, int r) {
		if(l<r) {
			int mid = l + (r-1)/2;
			mergeSort(arr, l, mid-1);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}

public static void merge (int a[], int l, int mid, int r) {
		int b[] = {};
		int i=l;
		int j=mid;
		int k=l;
		while(i<r) {
			if(a[i]<a[j]) {
				b[k] = a[i];
				i++;
			}
			else {
				b[k] =a[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=r) {
				b[k] = a[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=mid) {
				b[k] = a[i];
				i++;
				k++;
			}
		}
		
		for(int z=0; z<a.length; z++) {
			a[z] = b[z];
			z++;
		}
		
	}
