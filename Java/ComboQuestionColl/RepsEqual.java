import java.util.Arrays;

public class RepsEqual {

	public static void main(String[] args) {
		int[] a = {0, 3, 2, 0, 5, 3};
		int n = 32053;
		if (repsEqual(a, n) == 1) {
			System.out.printf("Array element %s contains ONLY digit of %d in same order",Arrays.toString(a),n);
		} else {
			System.out.printf("Array element %s DOESNOT contain digit of %d in same order",Arrays.toString(a),n);
		}
	
	}
	
	public static int repsEqual(int[] a, int n) {
		int num=0;
		
		for(int temp : a) {
			num = num*10 + temp;
		
		}
		
		if ( num == n) {
			return 1;
		} else {
			return 0;
		}
	
	}

}
