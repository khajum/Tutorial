import java.util.Arrays;

public class MeeraArray1 {

	public static void main(String[] args) {
		int[] a = {2, 8, 6, 10, -4};
		
		if (isMeera(a) == 1) {
			System.out.printf("%s Array is Meera Array",Arrays.toString(a));
		} else {
			System.out.printf("%s Array is NOT Meera Array",Arrays.toString(a));
		}	
	}
	
	public static int isMeera(int[] a) {
		int beginEvenNoCount = 0;
		int endEvenNoCount = 0;
		boolean isStartWithEvenNo = false;
		boolean isEndsWithEvenNo = false;

		if (a[0]%2 == 0 && a[a.length-1]%2 == 0) {
			isStartWithEvenNo = true;
			isEndsWithEvenNo = true;
		} else {
			return 0;
		}

		for (int i = 0; i<a.length; i++) {
			if(isStartWithEvenNo && a[i]%2==0) {
				beginEvenNoCount++;		
			} else if( a[i]%2 !=0) {
				isStartWithEvenNo = false;
				endEvenNoCount = 0;
			} else if(isEndsWithEvenNo && a[i]%2==0) {	
				endEvenNoCount++;	
			}
		}
		
			if (beginEvenNoCount == endEvenNoCount) {
				return 1;
			} else {
				return 0;
			}
}
}