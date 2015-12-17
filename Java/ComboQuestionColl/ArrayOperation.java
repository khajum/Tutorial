import java.util.Arrays;

public class ArrayOperation {
	
	public static void main(String[] args) {

		int[] a = {10,20,30,40,50};
		int flag;		
		flag = arrayHasNonZeroes(a);
		
		if (flag == 1)
			System.out.printf("Array %s has all elements are non-zero", Arrays.toString(a));
		else 
			System.out.printf("Array %s has all elements are not non-zero", Arrays.toString(a));
	}
			
	public static int arrayHasNonZeroes(int[] a) {
		int flag=1;
		
		for(int temp : a) {
			if (temp == 0) {
				flag=0;
				break;
			}
		}
	return flag;	
	}
	
}