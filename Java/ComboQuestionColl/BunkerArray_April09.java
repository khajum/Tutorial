public class BunkerArray_April09 {

	public static void main(String[] args) {
		//int a = isBunkerArray(new int[]{4, 9, 6, 15, 21});
		int a = isBunkerArray(new int[]{4, 9, 6, 7, 3}); 
		//int a = isBunkerArray(new int[]{3}); 
		
		System.out.println(a);
	}
	
	static int isBunkerArray(int[] a) {
		for(int i = 0; i<a.length-1; i++) {
			if(a[i]%2 != 0 && isPrime(a[i+1])) {
				return 1;
			}
		}		
		return 0;
	
	}
	
	static boolean isPrime(int n) {
		for(int i = 2; i<n; i++) {
			if(n%i == 0)
				return false;
		}
		
		return true;
	}
}
