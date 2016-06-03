/* 3. A Suff array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array.
For example, {2, 10, 9, 3} is a Suff array because
2 = 3-1
10 = 9+1
3 = 2 + 1
9 = 10 -1
 Other Suff arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
*/

public class SurfArray_March12{

	public static void main(String[] args) {
		//int a = isSurf(new int[]{2, 10, 9, 3});
		int a = isSurf(new int[]{3, 4, 5, 7});
		System.out.println(a);
	}

	static int isSurf(int[] a) {
		boolean sufFlag;
		for(int i =0; i<a.length; i++) {
			sufFlag = false;
			for(int j = 0; j<a.length; j++) {
				if(i != j && (a[i] == a[j] - 1 || a[i] == a[j] + 1)) {
					sufFlag = true;
					break;
				}	
			}
			
			if(!sufFlag)
				return 0;
		}
		
		return 1;
	
	}
}