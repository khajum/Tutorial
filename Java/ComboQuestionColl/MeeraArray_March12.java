public class MeeraArray_March12 {

	public static void main(String[] args) {
		//int a = isMeera(new int[]{3,7,8,1});
		int a = isMeera(new int[]{7, 6, 10}); 
		System.out.println(a);
	}
	
	static int isMeera(int[] a) {
		boolean hasOne = false;
		
		for(int val : a) {
			if(val == 1) {
				hasOne = true;
				break;
			}
		}
		
		if(hasOne) {
			for(int val : a) {
				if(isPrime(val))
					return 1;
			}
		
		}
		
		return 0;
	}
	
	static boolean isPrime(int n) {
		for(int i = 2; i<n; i++){
			if(n%i == 0)
				return true;
		}
		
		return false;
	}


}