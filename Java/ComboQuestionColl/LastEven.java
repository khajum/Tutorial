/*

3. Write a function named countMax that returns the number of times that the max value occurs in the array. For example, countMax would return 2 if the array is {6. 3, 1, 3, 4, 3, 6, 5}because 6 occurs 2 times in the array.

*/

public class LastEven {

	static int lastEven1(int[] a){
		int lastEvenIndex = -1;
		for(int i = 0; i< a.length; i++){
			if(a[i]%2 == 0){
				lastEvenIndex = i;
			}
		}
		return lastEvenIndex;
	}

	static int lastEven(int[] a){
		int lastEvenIndex = -1;
		for(int i = a.length-1; a[i]>=0; --i){
			if(a[i]%2 != 0){
				lastEvenIndex++;
			} else {
				break;
			}
		}
		return (a.length - lastEvenIndex);
	}	
	public static void main(String[] args) {
		
		int[] a = {3,2,5,6,7};
		System.out.println("Last Even Index of A is:"+ lastEven(a));
		
		int[] b = {3,2,5,6,7,8, 10, 4, 3, 24};
		System.out.println("Last Even Index of B is:"+ lastEven(b));
		
		int[] c = {3,5,7};
		System.out.println("Last Even Index of C is:"+ lastEven(c));

	}

}