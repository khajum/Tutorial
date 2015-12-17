import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int n = new Scanner(System.in).nextInt();
		
		if(isFibonacci(n) == 1) {
			System.out.println("Number "+n+" is fibonaci number");
		} else {
			System.out.println("Number "+n+" is NOT fibonaci number");
		}
	}
	
	public static int isFibonacci(int n) {
		int fibonacciFlag = 0;
		
		for(int i=1; i<=n+1; i++) {
			if(fibonacci(i) == n) {
				return 1;
			} else if (fibonacci(i) > n) {
				return 0;
			}
		}
		
		return fibonacciFlag;
	
	}
	
	public static int fibonacci(int n) {
		if(n ==1 || n==2) {
			return 1;
		}
		return fibonacci(n-2) + fibonacci(n-1);
	}

}
