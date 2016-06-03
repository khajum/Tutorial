public class BunkerArra_April09{

	public static void main(String[] args) {
		int a = isBunkerArray(new int[]{}{4, 9, 6, 15, 21});
		System.out.println(a);
	}
	
	static int isBunkerArray(int[] a) {
		for(int i = 0; i<a.length-1; i++) {
			if(a[i]%2 != 0 && isPrime(a[i+1])) {
				return true;
			}
		}		
		return false;
	
	}
}
