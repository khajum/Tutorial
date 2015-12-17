import java.util.Arrays;
import java.util.Collections;
import java.*;

public class Enertial {

	public static void main(String[] arg) {
	
		int[] a ={11, 4, 20, 9, 2, 8} ;
		boolean enertialFlag;
		
		enertialFlag = isEnertial(a);
		
		if(enertialFlag) {
			System.out.printf("Array %s is Enertial", Arrays.toString(a));
		} else {
			System.out.printf("Array %s is not Enertial", Arrays.toString(a));
		}
		
		
	}
	
	public static boolean isEnertial(int[] a) {
		int[] sortedArray = new int[a.length];
		boolean oldFlag = false;
		boolean maxValEvenFlag = false;
		boolean OddGtEvenFlag = true;
		
		// check for odd element
		for(int value : a) {
			if (isOdd(value)) {
				oldFlag = true;
			}
		}
		
		// Order array in Descending order 
		/*
		for( int i = 0; i<a.length-1; i++) {
			int maxValue = a[i];
			for(int j = i+1; j<a.length; j++) {
				if (a[j] > a[i])
					maxValue = a[j];
			}
			sortedArray[i] = maxValue;	
		}
		*/
		
		Arrays.sort(a, Collections.reverseOrder());

		System.out.printf("Sorted array of %s is %s",Arrays.toString(a),Arrays.toString(a));
		System.out.println();
		
		// if first element of Sorted array is even then maxValEvenFlag is true
		if (!isOdd(sortedArray[0])) {
			maxValEvenFlag = true;
		}

		for (int i = 2; i<sortedArray.length; i++) {
			if (!isOdd(sortedArray[i-1]) && isOdd(sortedArray[i])) { // even number is before odd number
				OddGtEvenFlag = false;
			}
		}	
	
		if ( oldFlag == true && OddGtEvenFlag == true && maxValEvenFlag == true ) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean isOdd(int number) {
		if (number%2 != 0) {
			return true;
		} else {
			return false;
		}	
	}
}


