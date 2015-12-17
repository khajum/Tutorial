import java.util.Scanner;
import java.util.Arrays;

public class DepthOfNumber {
	
	public static void main(String[] args){
		// input to find depth of given number
		System.out.print("Enter number to find its depth : ");
		int number = new Scanner(System.in).nextInt();
		int depth;
		depth = computeDepth(number);
		
		//printing depth of given integer
		System.out.printf("The depth of integer %d is : %d",number,depth);
	}
	
	/*
	* Method to find depth of number n. It returns the depth.
	*/
	public static int computeDepth(int n) {
	
		int depth = 0;
		int multiplier = 1;
		int multiples;
		int[] contributedDigits = new int[10];
		int i=0;
		boolean newDigitFlag; // variable to flag whether digit is new digit contributed or not.
		int zeroDigitContributedFlag = 0; // variable to flag whether 0 digit is new digit contributed or not.
		
		while (i != 9) {
			multiples = n*multiplier;
			System.out.println(n+"*"+multiplier+" = "+multiples);
			int rem = multiples;
			// Find digits in multiples of number and store it to zeroDigitContributedFlag array if it is new digit contributed.
			while(rem!=0) {
				int digit;
				digit = rem%10;
				
				newDigitFlag = true;
				
				// if digit of multiples is equal to any element of zeroDigitContributedFlag array then it is not new digit contributed.
				for (int temp : contributedDigits) {
					if (temp==digit) { 
							newDigitFlag = false;
							break;
					}
				}
				
				// if digit is identified as new digit contributed then store it to zeroDigitContributedFlag array.
				if(newDigitFlag) {
			
					if (digit == 0 && zeroDigitContributedFlag==0) {
						contributedDigits[i] = digit; 
						i++;
						zeroDigitContributedFlag = 1;
					} else if (digit != 0){
						contributedDigits[i] = digit; 
						i++;					
					}
				}
				rem=rem/10;
			}
			
			depth++;
			multiplier++;
			
		}
		
	System.out.println("Contributed digit is : "+Arrays.toString(contributedDigits));
	return 	depth;

	}
}

 