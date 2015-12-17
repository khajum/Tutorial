import java.util.Arrays;


public class MadhavArray {

	public static void main(String[] args) {
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
		
		if(isMadhavArray(a) == 1) {
			System.out.printf("Array %s is Madhav Array", Arrays.toString(a));
		} else {
			System.out.printf("Array %s is not Madhav Array", Arrays.toString(a));
		}
	
	}
	
	public static int isMadhavArray(int[] a) {
		int flag = 1;
		int arraySize = a.length;

		
		// checking condition of  Array size is equal to n(n+1)/2
		for (int i = 1; i<arraySize; i++) {
			if( i*(i+1)/2 == arraySize) {
				break;
			}
			
			if( i*(i+1)/2 > arraySize) {
				return 0;
			} 
		}
	
		// Checking condition of a[0] = a[1] + a[2] = a[3]+a[4]+a[5]=... if n(n+1)/2 condition satisfyies

		int firstItem = a[0];

			for(int i = 2; i< arraySize; i++) {
				int nextItem = 0;
				for (int j=(i-1)*i/2; j<i*(i+1)/2; j++) {
					
					nextItem+= a[j];
				}
				
				System.out.printf("%d = %d",firstItem,nextItem);
				System.out.println();
				if(firstItem != nextItem) {
					return 0;
				}
				
				
				if(i*(i+1)/2==arraySize) {
					return 1;
				}
			}
	
	
		return flag;
	
	}
}