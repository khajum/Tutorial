/*
2. An Sub array is defined to be an array in which each element is greater than sum of all elements after that. See examples below:
 
{13, 6, 3, 2} is a Sub array. Note that 13 > 2 + 3 + 6, 6 > 3 + 2, 3 > 2.
 
{11, 5, 3, 2} is a NOT a Sub array. Note that 5 is not greater than 3 + 2.

*/
public class SubArray_March12{
	public static void main(String[] args) {
		//int a = isSub(new int[]{13, 6, 3, 2});
		int a = isSub(new int[]{11, 5, 3, 2});
		System.out.println(a);
	
	}
	
	static int isSub(int[] a) {
		int sum;
		for(int i = 0; i<a.length-1; i++) {
			sum = 0;
			for(int j = i+1; j<a.length; j++) {
				sum+=a[j];
			}
			
			if (!(a[i]>sum)){
				return 0;
			}	
		}
		
		return 1;
	
	}

}