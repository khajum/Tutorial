/*

3. An isSym (even/odd Symmetric) array is defined to be an array in which even numbers and odd numbers appear in the same order from "both directions". 
You can assume array has at least one element. See examples below:
 
{2, 7, 9, 10, 11, 5, 8,9} is a isSym array.
 
Note that from left to right or right to left we have even, odd, odd, even, odd, odd, even.

*/

public class SymmArray_March12 {

	public static void main(String[] args) {
		//int a = isSym(new int[]{2, 7, 9, 10, 11, 5, 8});
		//int a = isSym(new int[] {9, 8, 7, 13, 14, 17});
		int a = isSym(new int[]{2, 7, 8, 9, 11, 13, 10});
		System.out.println(a);
	}
	
	static int isSym(int[] a){

		int mid, mid1, mid2,offSet;
		int length = a.length;
	
		if(!isEven(length)){
			mid = (length + 1)/2;
			offSet = length - mid;
			for(int i = 1; i<=offSet; i++) {
				if(isEven(a[mid-1-i]) ^ isEven(a[mid-1+i]))
				//if((isEven(a[mid-1-i]) && !isEven(a[mid-1-i])) ||( !isEven(a[mid-1+i]) && isEven(a[mid-1+i])) )	
				return 0;
			}
		
		} else {
			mid1 = length/2;
			mid2 = length/2 + 1;
			offSet = length/2 - 1;
			if(isEven(a[mid1-1]) ^ isEven(a[mid2-1]))
				return 0;
				
			for(int i = 1; i<=offSet; i++) {
				if(isEven(a[mid1-i-1]) ^ isEven(a[mid2+i-1]))
					return 0;
			}				
		}
		
		return 1;	
	
	}
	
	static boolean isEven(int n){
		return (n%2 == 0)?true:false;
	}
}