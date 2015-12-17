/*
Algorithm:
1. Sort the array.
2. Increase variable MaxOccurance by 1 if two adjucent array element is same. otherwise MaxOccurance =0. repeat process for all elements
3. if MaxOccurance >= 3 then return 1 otherwise return 0;
*/

import java.util.Arrays;

public class GoodSpread {

	public static void main(String[] args) {
	
		int[] arr = {3, 1, 3 ,1, 3, 5, 5,3};
		if ( goodSpread(arr) == 1) {
			System.out.printf("Array %s has no value occurs more than 3 times",Arrays.toString(arr));
		} else {
		
			System.out.printf("Array %s has at least one value occurs more than 3 times",Arrays.toString(arr));
		}
	}
	
	public static int goodSpread(int[] a) {
	
		//int[] sortedArray = new int[a.length];
		int maxOccurance = 1;
		
		// Sort the Array
		for (int i = 0 ; i<a.length-1; i++) {
			
			int minValue = a[i];
			
			for(int j = (i+1); j<a.length; j++) {
				if (a[j] < a[i]) {
					minValue = a[j];
					a[j] = a[i];
					a[i] = minValue;
					
				}
			}
		}	
		
		// if two adjecent array element is equal then increase maxOccurance by 1  
		for (int i = 0; i<a.length-1; i++) {
			if (a[i] == a[i+1]) {
				maxOccurance++;
			} else {
				maxOccurance = 1;
			}
			
			// if maxOccurance is greater than 3 then return 0;
			if (maxOccurance > 3) {
				return 0;
			}
		}
		
		return 1;
	}
}