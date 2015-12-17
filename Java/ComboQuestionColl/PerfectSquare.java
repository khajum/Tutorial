import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// input to print next perfect squar of given number
		System.out.print("Enter the number to find first perfect square that is greater than given number : ");
		int n = new Scanner(System.in).nextInt();
				
		int nextPerfectSquare = isPerfectSquare(n);	
		System.out.printf("First perfect square that is greater than %d is %d", n, nextPerfectSquare);
	}

	public static int isPerfectSquare(int n) {
	
		int perfectSquare=0;
		for (int i =0; i<=(n+1); ++i){
			perfectSquare = i*i;
			if (perfectSquare>n) {			
				break;
			}
		}
		return perfectSquare;
	}
}