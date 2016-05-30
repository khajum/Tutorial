public class Fill {

	public static void main(String[] agrs) {
	int[] a1, a2;
	a1 = fill(new int[]{1,2,3,5, 9, 12,-2,-1}, 3, 10);
	a2 = fill(new int[]{4, 2, -3, 12}, 1, 5);
	
	System.out.println("%s",java.util.Array.toString(a1));
	}
	
	public static int[] fill(int[] arr, int k, int n) {
	
		int[] array2 = new int[n];
		
		if (k<=0 || n<=0)
			return null;
			
		for(int i = 0; i<n; i++) {
			array2[i] = arr[i%k];
		}
		
		return array2;
	
	}
}