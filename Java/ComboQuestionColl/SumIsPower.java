import java.util.Arrays;
import java.lang.*;

public class SumIsPower {

	public static void main(String[] args) {
	
		int[] a = {8,8,4,12};
		
		if (sumIsPower(a)) {
			System.out.printf("Sum of element in array %s is power of 2.",Arrays.toString(a));
		} else {
			System.out.printf("Sum of element in array %s is NOT power of 2.",Arrays.toString(a));
		}	
	}
	
	public static boolean sumIsPower(int[] arr) {
		int sum=0;
		
		for(int a : arr) {
			sum+=a;
		}
		
		if(isPowerOfTwo(sum)) {
			return true;
		} else {
			return false;
		}
	
	}	
	
	public static boolean isPowerOfTwo(int n) {
	
		for(int i = 1; i<=n; i++) {
			if(Math.pow(2,i) == n) {
				return true;
			} else if (Math.pow(2,i) > n){
				return false;
			}
		}
		
		return false;
	}
}
