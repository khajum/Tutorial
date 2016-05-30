import java.util.Scanner;

public class FactorTwoCount {

	public static void main(String[] args) {
		System.out.print("Enter the no : ");
		int n = new Scanner(System.in).nextInt();
		
		System.out.printf("%d is divided by 2 for %d times", n, factorTwoCount(n));
	}
	
	public static int factorTwoCount(int n) {
	int noOfTimes = 0;
	
	while(n%2 == 0) {
		n = n/2;
		noOfTimes++;
	}
	
	return noOfTimes;
	}
}
