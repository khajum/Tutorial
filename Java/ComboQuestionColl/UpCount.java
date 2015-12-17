import java.util.Arrays;

public class UpCount {

	public static void main(String[] args) {
	
		int a[] ={2, 3, 1, -6, 8, -3, -1, 2};
		int n = 5; 
		int upCount;
		
		upCount = nUpCount(a,n);
		System.out.printf("The %d upcount of array %s is %d",n,Arrays.toString(a),upCount);
	}

	public static int nUpCount(int[] a, int n) {
		int partialSum=0;
		int upCount = 0;
		
		for (int i = 0; i<a.length-1; i++) {
			partialSum+=a[i];
			if (partialSum<=n && (partialSum + a[i+1])>n) {
				upCount+= 1;
			}						
		}		
		return upCount;		
	}
}
