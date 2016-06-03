/*
1. An integer array is said to be evenSpaced, if the difference between the largest value and the smallest value is an even number. 
Write a function isEvenSpaced(int[] a) that will return 1 if it is evenSpaced and 0 otherwise. 
If array has less than two elements, function will return 0. If you are programming in C or C++, the function signature is:
   int isEvenSpaced (int a[ ], int len) where len is the number of elements in the array.
*/

public class EvenSpaced_Feb27{
	public static void main(String[] args) {
		//int a = isEvenSpaced(new int[]{100,19, 131, 140});
		//int a = isEvenSpaced(new int[] {200, 5, 151, 160, 4, 205});
		int a = isEvenSpaced(new int[] {100, 19, -131, -140});
		//int a = isEvenSpaced(new int[] {80, -56, 11, -81});
		System.out.println(a);
	}
	
	static int isEvenSpaced(int[] a) {
		int smallestVal = a[0];
		int largestVal = a[0];
		
		if(a.length<2)
			return 0;
			
		for(int i = 1; i<a.length; i++) {
			if(a[i] < smallestVal)
				smallestVal = a[i];			
			else if(a[i]>largestVal)
				largestVal = a[i];
		
		}
		
		System.out.println(smallestVal);
		System.out.println(largestVal);
		
		if((largestVal - smallestVal)%2 ==0)
			return 1;
		else 
			return 0;
	
	}

}