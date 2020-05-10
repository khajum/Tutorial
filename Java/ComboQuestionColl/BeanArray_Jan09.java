/*
3. An array is defined to be a Bean array if it meets the following conditions
   a. If it contains a 9 then it also contains a 13.
   b. If it contains a 7 then it does not contain a 16.
 
So {1, 2, 3, 9, 6, 13}  and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are Bean arrays. The following arrays are not Bean arrays:
   a. { 9, 6, 18} (contains a 9 but no 13)
   b. {4, 7, 16} (contains both a 7 and a 16)
*/

public class BeanArray_Jan09 {

	public static void main(String[] args) {
		int[] a = {1,2,3,9,6,13};
		System.out.println("Is a Bean Array? : "+  isBeanArray(a));
		
		int[] b = {3,4,6,7,13,15};
		System.out.println("Is b Bean Array? : "+  isBeanArray(b));
		
		int[] c = {1,2,3,4,10,11,12};
		System.out.println("Is c Bean Array? : "+  isBeanArray(c));
		
		int[] d = {3,6,9,5,7,13,6,17};
		System.out.println("Is d Bean Array? : "+  isBeanArray(d));
		
		int[] e = {9,6,18};
		System.out.println("Is e Bean Array? : "+  isBeanArray(e));
		
		int[] f = {4,7,16};
		System.out.println("Is f Bean Array? : "+  isBeanArray(f));
	}

	static int isBeanArray(int[] a) {
		boolean hasNine=false,hasThirteen=false, hasSeven=false, hasSixteen=false;
		
		for(int val : a) {
			if(val == 9)
				hasNine = true;
			else if (val ==13)
				hasThirteen = true;
			else if (val == 7)
				hasSeven = true;
			else if (val == 16)
				hasSixteen = true;

				
		}
		
		if(hasNine ^ hasThirteen)
			return 0;
		else if (hasSeven ^ hasSixteen)
			return 0;
		
		return 1;	
		
	
	}

}


