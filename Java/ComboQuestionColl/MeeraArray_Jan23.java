/*
2. A Meera array is an array that contains the value 1 if and only if it contains 9. The array {7, 9, 0, 10, 1} is a Meera array because it contains 1 and 9. The array {6, 10, 8} is a Meera array because it contains no 1 and also contains no 9.
 
The array {7, 6, 1} is not a Meera array because it contains 1 but does not contain a 9. The array {9, 10, 0} is not a Meera array because it contains a 9 but does not contain 1.
 
It is okay if a Meera array contains more than one value 1 and more than one 9, so the array {1, 1, 0, 8, 0, 9, 9, 1} is a Meera array.
 
Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 otherwise

Algorithm:
For each element in array
1. Check if element is 1.
2. Check Check if element is 9 
3. if both 1 and 9 exists then return 1, otherwise, continue the loop
4. return 0 
*/

public class MeeraArray_Jan23{

	public static void main(String[] args) {
		System.out.println(isMeera(new int[]{7, 9, 0, 10, 1}));
		System.out.println(isMeera(new int[]{6, 10, 8}));
		System.out.println(isMeera(new int[]{7, 6, 1}));
		System.out.println(isMeera(new int[]{9, 10, 0}));	
		System.out.println(isMeera(new int[]{1, 1, 0, 8, 0, 9, 9, 1}));			
	
	}
	
	static int isMeera(int[] a) {
		boolean hasOne=false, hasNine = false;
		
		for(int val : a) {
			if (val == 1) {
				hasOne = true;
			} else if (val == 9) {
				hasNine = true;
			}
			
			if(hasOne && hasNine)
				return 1; 
		}
		
		return 0;
	
	}

}