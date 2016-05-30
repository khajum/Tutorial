public class GoodSpread1 {
	public static void main(String[] args) {
		int[] arr = new int[]{3, 1, 3 ,1, 3, 5, 5,3};
		System.out.println(isGoodSpread(arr));
	}
	
	static int isGoodSpread(int[] a) {
	
		int occurance;
		for(int i = 0; i<a.length; i++) {
			occurance = 1;
			for(int j=0; j<a.length; j++) {
				if (i != j) {
					if (a[i] == a[j]) {
						occurance++;
					}
				}
			}
			
			if (occurance > 3) {
				return 0;
			}
		}
		
		return 1;
	}
	

}