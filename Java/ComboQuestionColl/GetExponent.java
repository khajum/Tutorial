public class GetExponent {
	public static void main(String[] args) {

		System.out.println("n = 27, p = 3 :" + getExponent(27, 3));
		
		System.out.println("n = 28, p = 3 :" + getExponent(28, 3));
		
		System.out.println("n = 280, p = 7 :" + getExponent(280, 7));
		
		System.out.println("n = -250, p = 5 :" + getExponent(-250, 5));
		
		System.out.println("n = 18, p = 1 :" + getExponent(18, 1));
		
		System.out.println("n = 128, p = 4 :" + getExponent(128, 4));
	}
	
	static int getExponent(int n, int p){
		if(p<=1)
			return -1;
		
		int expo = 0;	
		while(n%p == 0) {
			n/=p;
			expo++;	
		}
		
		return expo;
	
	}
	
	static int getExponent1(int n, int p) {
	
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