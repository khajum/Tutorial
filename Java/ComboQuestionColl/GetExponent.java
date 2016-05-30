public class GetExponent {
	public static void main(String[] args) {
		int a = getExponent(128,4);
		System.out.println(a);
	}
	
	static int getExponent(int n, int p) {
	
		int i = 0;
		
		if (p<=1) {
			return -1;
		}
		
		while(true) {
		
			if(n % java.lang.Math.pow(p,i) != 0 ){
				break;
			}	

			i++;	
		}
		
		return i-1;
	}


}