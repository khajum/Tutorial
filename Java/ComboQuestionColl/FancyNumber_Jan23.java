/*
1. A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first two fancy numbers are 1 and any fancy number other than the first two is sum of the three times previousone and two times the one before that. See below:
1,
1,
3*1 +2*1 = 5
3*5 +2*1 = 17
3*17 + 2*5 = 61
 
Write a function named isFancy that returns 1 if its integer argument is a Fancy number, otherwise it returns 0.

*/
public class FancyNumber_Jan23{

	public static void main(String[] args) {
		System.out.println(isFancy(1));
		System.out.println(isFancy(5));
		System.out.println(isFancy(17));
		System.out.println(isFancy(61));
		System.out.println(isFancy(60));
	
	}
	
	static int isFancy(int n) {
	
		int prev1=1, prev2=1, sum = 0;
		
		if(n == 1)
			return 1;
			
		while(sum<=n) {
			sum = 2*prev1 + 3 * prev2;
			if(sum ==n)
				return 1;
			
			prev1 = prev2;
			prev2 = sum;	
		}
		
		return 0;
	}

}