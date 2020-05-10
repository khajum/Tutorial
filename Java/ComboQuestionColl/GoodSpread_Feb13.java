/*
3. Write a function called goodSpread that returns 1 if no value in its array argument occurs more than 3 times in the array.
For example, goodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9} returns 1 because no value occurs more than three times.
But goodSpread(new int[ ] {3, 1, 3 ,1, 3, 5, 5, 3} ) returns 0 because the value 3 occurs four times.
*/

public class GoodSpread_Feb13 {
	public static void main(String[] args) {
		int arr[] = new int[]{2, 1, 2, 5, 2, 1, 5, 9};
		int arr2[] = new int[]{3, 1, 3 ,1, 3, 5, 5,3};
		System.out.println(isGoodSpread(arr));
		System.out.println(isGoodSpread(arr2));
	}
	
	static int isGoodSpread(int[] a) {
	
		int occurance;
		for(int i = 0; i<a.length; i++) {
			occurance = 1;
			for(int j=0; j<a.length; j++) {
					if (i !=j && a[i] == a[j]) {
						occurance++;
					}
			}
			
			if (occurance > 3) {
				return 0;
			}
		}
		
		return 1;
	}
	

}