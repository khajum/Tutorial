public class PascalNumber_March12 {
	public static void main(String[] args){
		System.out.println("6=" + isPascal(6));
		System.out.println("7=" + isPascal(7));
		System.out.println("15=" + isPascal(15));
	}
	
	static int isPascal(int n) {
		int i = 1, sum=0;
		while(sum <= n) {
			sum+=i;
			if(sum == n)
				return 1;
			i++;	
		}
	return 0;	
	}
	
}