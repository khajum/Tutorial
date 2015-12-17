import java.util.Scanner;
import java.*;

public class PrimeCount {

	public static void main(String[] string) {
		int primeCount=0;
		
		System.out.print("Enter start number : ");
		int startNumber = new Scanner(System.in).nextInt();
		
		System.out.print("Enter end number : ");
		int endNumber = new Scanner(System.in).nextInt();	
		
		for (int i = startNumber; i<=endNumber; i++) {
			if(isPrime(i)) {
				primeCount+=1;
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		
		System.out.printf("Prime count between %d and %d inclusive is %d",startNumber,endNumber,primeCount);
	}
	
	public static boolean isPrime(int number) {

		// -ve nubmer is not prime
		if(number < 1) {
			return false;
		}

		for(int i = 2; i<=number/2; i++) {
			if (number%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}