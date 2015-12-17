import java.util.Arrays;

public class Solve10 {

	public static void main(String[] args) {
	
		System.out.printf("x!+y! = 10, where x and y is : %s", Arrays.toString(solve10()));
	}
	
	public static int[] solve10() {
	
		int i=0,j=0;
		int[] a = new int[2];
		
		for (i = 1; i<10; ++i) {
		
			for(j = 1; j<10; ++j) {
				if(factorial(i) + factorial(j) == factorial(10)) {
					break;
				}
			}
		}
		
		a[0] = i;
		a[1] = j;
		
		return a;
	}
	
	public static int factorial(int n) {
		if (n == 1 || n==0) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
}