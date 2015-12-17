import java.util.Arrays;

public class MeeraArray {

	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8, 6};
		
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
		if(a[0]%2 != 0) {
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
}