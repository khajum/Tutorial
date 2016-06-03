public class MeeraArray_April09 {
	public static void main(String[] args) {
		//int a = isMeera(new int[]{8,3,4});
		int a = isMeera(new int[]{5,3,-2});
		System.out.println(a);
		
	}
	
	static int isMeera(int[] a) {
	
		for(int i =0; i<a.length; i++)
		for(int j=0; j<a.length; j++){
			if(i != j) {
				if(a[i] == 2*a[j])
					return 1;
			}
		}
		
		return 0;
	}

}