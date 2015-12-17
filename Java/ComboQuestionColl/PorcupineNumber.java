/*
1. find prime no greater then given no.
2. Check if this prime no ends with 9
3. If not ends with 9, then continue to find next prime.
4. if ends with 9, find next prime which ends with 9 and return it
*/

import java.util.Scanner;

public class PorcupineNumber {

	public static void main(String[] args) {
	
		// input no n to find Percupine Number greater than given no.
		System.out.print("Enter no to find 1st percupine Number greater than n :");
		int n = new Scanner(System.in).nextInt();
		
		System.out.println();
		System.out.printf("Percupine Number greater than %d is %d",n,findPorcupineNumber(n));
	}
	
	public static int findPorcupineNumber(int n) {
		int firstPrime;
		int secondPrime;
		
		do {		
			n+=1;
			
			while(!isPrimeNumber(n) || n%10 != 9) {
				n++;
			}	
			
			firstPrime = n;
			System.out.println(n);
			n++;
			while(!isPrimeNumber(n)) {
				n++;
			}				
			
			secondPrime = n;	
			System.out.println(n);
		} while(firstPrime%10 !=9 || secondPrime%10 != 9);
		
		
		return firstPrime;
	}
	
	public static boolean isPrimeNumber(int n) {
	
		for(int i=2; i < n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}



