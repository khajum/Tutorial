/*

Algorith:
1. Find odd value. if not exists return 0.
2. find max value. if it is not even return 0.
3. find min odd value and 2nd highest even value. if min odd value is < 2nd highest odd value return 0;

*/

import java.util.Arrays;

public class Inertial {

	public static void main(String[] args) {
		int[] a = {1, 1, 1, 1, 1, 1, 2};
		if(isInertial(a) == 1) {
			System.out.printf("Array %s IS Inertial",Arrays.toString(a));
		} else {
			System.out.printf("Array %s IS NOT Inertial",Arrays.toString(a));
		}

	}
	
	public static int isInertial(int[] a) {
		int inertialFlag = 1;
		int allEvenFlag = 1;
		// Check if array contains at least one odd value
		for(int temp : a) {
		
			if(temp%2 != 0) {
				allEvenFlag = 0;
				break;
			}						
		}
		
		if (allEvenFlag == 1) {
			return 0;
		}
		
		// find Maximum value in array elements. Also, find min odd value and 2nd highest even value. 
		int maxValue = Integer.MIN_VALUE;
		int minOddValue = Integer.MAX_VALUE;
		int maxEvenValue = Integer.MIN_VALUE;
		int secondHighestEvenValue = Integer.MIN_VALUE;;
		
		for (int temp : a) {
			
			// find max value
			if (temp > maxValue) {
				maxValue = temp;
			}
			
			// find min Odd value
			if (temp%2 != 0 &&  temp < minOddValue) {
				minOddValue = temp;
			}

			//find 2nd highest even value
			if (temp%2 == 0 &&  temp > maxEvenValue) {		
				secondHighestEvenValue = maxEvenValue;
				maxEvenValue = temp;
							
			} else if (temp%2 == 0 &&  temp > secondHighestEvenValue) {
				secondHighestEvenValue = temp;
			}
			
		}
		
		// if max value is not even return 0.
		if (maxValue%2 != 0) {
			return 0;
		}
		
		// min odd value is < 2nd highest odd value return 0 
		if(minOddValue < secondHighestEvenValue) {
			return 0;
		}
		
		return inertialFlag;
		
	}
}