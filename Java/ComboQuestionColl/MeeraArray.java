import java.util.Arrays;

public class MeeraArray {

	public static void main(String[] args) {
		int[] a = {2, 8, 7, 10, -4, 6};
		
		if (isMeera(a) == 1) {
			System.out.printf("%s Array is Meera Array",Arrays.toString(a));
		} else {
			System.out.printf("%s Array is NOT Meera Array",Arrays.toString(a));
		}	
	}
	
	public static int isMeera(int[] a) {
		boolean oddNumberFlag = false;
		int noOfEvenNumberAtBegin = 0;
		int noOfEvenNumberAtEnd = 0;
		
		//if array element does not starts with even then return 0.
		if(a[0]%2 != 0 && a[a.length-1]%2 !=0) {
			return 0;
		}

		// Checking odd number element and finding no of even number at beginning
		for (int val : a) {
			if (val%2 !=0) {
				oddNumberFlag = true;
				break;		
			}
			
			noOfEvenNumberAtBegin++;
		}

		// if array has not at least 1 odd number then return 0
		if(!oddNumberFlag) {
			return 0;
		}
		// finding no of even number at end
		for ( int i=a.length-1; i>=0; i--) {

			if (a[i]%2 != 0) {
				break;
			}
			
			noOfEvenNumberAtEnd++;
		}
		
		System.out.println(noOfEvenNumberAtBegin+"="+noOfEvenNumberAtEnd);
		// if no of even numbers at begin and end is same then return 1, otherwise, return 0
		if (noOfEvenNumberAtBegin == noOfEvenNumberAtEnd) {
			return 1;
		} else{
			return 0;
		}
	}
	
	/*
	Algorithm:
	1. if first and last element of array is not even, return 0;
	2. Count even numbers at the beginning.
	3. Count even numbers at the end.
	4. if even numbers at beginning = even number at end return 1, otherwise return 0
	*/
	static int isMeera_2(int[] a) {
		
		if(a[0]%2!=0 && a[a.length-1]%2!=0) {
			return 0;
		}
		
		int beginEvenCount=0;
		int endEvenCount=0;
		for(int val : a) {
			(val%2 == 0)?beginEvenCount++:break;
		}
		
		for(int i = a.length-1; i>=0; i--) {
			(a[i]%2==0)?endEvenCount++:break;
		}
		
		return (beginEvenCount == endEvenCount)? 1:0; 
	
	}
}