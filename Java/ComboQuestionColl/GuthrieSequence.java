/*
1. If last element of array is not 1 return false.
2. for all elements,if first no is not equal to 2nd no then return false 
*/

import java.util.Arrays;

public class GuthrieSequence{

	public static void main (String[] args) {
	
		int[] a = {8,4,1};
		
		if(isGethrieSequence(a) == 1) {
			System.out.printf("Array %s is the GethrieSequence",Arrays.toString(a));
		} else {
			System.out.printf("Array %s is NOT the GethrieSequence",Arrays.toString(a));
		}
	}
	
	public static int isGethrieSequence(int[] a) {
		int size = a.length;
		if (a[size-1] != 1) {
			return 0;
		}
		
		for (int i=0; i<size-1; i++) {
			int nextNumber;
			
			if (a[i]%2 == 0) {
				nextNumber = a[i]/2;	
			} else {
				nextNumber = a[i]*3 + 1;
			}
			
			if (nextNumber != a[i+1]) {
				return 0;
			}
		}
	
		return 1;
	}	
}