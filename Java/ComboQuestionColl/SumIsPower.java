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
	
	static boolean isPowerOfTwo(int n) {
		while(n%2==0 && n>1)
			n /=2;
		return (n == 1);		
	
	}
	
	static boolean isPowerOfTow_2(int n) {
	
		if(n<2){
			return false;
		}
		while(n != 1) {
			if(n%2!=0) {
				return false;
			}
			
			n /= 2;
		
		}
		
		return true;
	
	}
	
}
