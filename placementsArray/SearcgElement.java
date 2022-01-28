// Below given code is basic representation of a searching algorithm used on an array to find if the give number is present inside the array.

package placementsArray;

import java.util.Arrays;

public class SearcgElement {

	public static void main(String[] args) {

		int a[] = {3,5,1,8,10,4,38,4};
		int e = 38;
 
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			if(a[i] ==e ) {
				System.out.println("the element is found :)");
			}
			else  {
				System.out.println("the element not found  ");
			}
			
		}

		}
		
	}


