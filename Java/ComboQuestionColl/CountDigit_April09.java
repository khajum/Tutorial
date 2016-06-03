public class CountDigit_April09 {

	public static void main(String[] args) {
		int count = countDigit(33331, 6);
		//int count = countDigit(33331,3);
		
		System.out.println(count);
	}

	static int countDigit(int n, int digit) {
		int rem, count=0;
		
		if (n < 0) {
			return -1;
		}
		while(n !=0) {
			rem = n%10;
			n /=10;
			if ( rem == digit) {
				count+=1;
			}	
		
		}
		
		return count;
	
	}
}