/*
1. Check if no. is +ve. then sum the no and next one +ve no.
2. if sum of perfect squary, increase squareCount by 1.
3. do this for all no.
*/

import java.util.Arrays;
public class SquarePairs {

	public static void main(String[] args) {
		int[] a = {9,-7,7};
		System.out.printf("Array %S has %d square count.",Arrays.toString(a),countSquarePairs(a));
	}
	
	public static int countSquarePairs(int[] a) {
		int count=0;
		for(int i = 0; i<a.length; i++) {
		
			if(a[i] < 1) {
				continue;
			}
			
			for(int j=0; j<a.length; j++) {
				
				if (a[j]<1 || i == j) {
					continue;
				}
				
				if (a[i] < a[j] && isPerfectSquare(a[i] + a[j])) {
						count+=1;
				}
			}			
		}
		
		return count;
	}
	
	public static boolean isPerfectSquare(int n) {
		for(int i = 1; i<=n; i++) {
			if(i*i == n) {
				return true;
			} else if (i*i > n) {
				break;
			}
		}
		
		return false;
	
	}
}