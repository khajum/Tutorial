/*

1. A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that first two Fibonacci numbers are 1 and any Fibonacci number other than the first two is the sum of the previous twoFibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
 
Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number, otherwise it returns 0.

*/

public class Fibonacci_Oct02{

	public static void main(String[] args) {
		System.out.println(isFibonacci(5));
		System.out.println(isFibonacci(13));
		System.out.println(isFibonacci(21));
		System.out.println(isFibonacci(22));
	}
	
	static int isFibonacci(int n) {
		int febo1=1, febo2=1, sum=0;
		
		if(n == 1) {
			return 1;
		}
		
		while(sum<=n) {
			if(sum == n)
				return 1;
			sum = febo1 + febo2;	
			febo1 = febo2;
			febo2 = sum;		
		
		}
		
		return 0;
	}

}
