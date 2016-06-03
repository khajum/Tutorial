public class GetExponent {
	public static void main(String[] args) {
		int a = getExponent(-25,5);
		System.out.println(a);
	}
	
	static int getExponent(int n, int p) {
	
		int i = -1;
		
		if (p<=1) {
			return -1;
		}
		
		/*
		while(true) {
		
			if(n % java.lang.Math.pow(p,i) != 0 ){
				break;
			}	

			i++;	
		}
		*/
		double exponent;		
		
		do{
			i++;
			exponent = java.lang.Math.pow(p,i);
		
		} while(n%exponent==0);
		
		return i-1;
	}


}