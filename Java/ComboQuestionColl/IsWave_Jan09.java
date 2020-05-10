public class IsWave_Jan09 {

	int isWave(int[] a){
		if(a.length == 1){
			return 1;
		}
		for(int i = 0; i < a.length-1; i++){
			//if((a[i]%2 == 0 && a[i+1]%2 != 0) || (a[i]%2 != 0 && a[i+1]%2 == 0)){
			if(a[i]%2 == a[i+1]%2){
				return 0;
			}
		}
		return 1;
	}
	
	int isWave2(int[] a){
	
		if(a.length == 1){
			return 1;
		}
		
		for(int i = 0; i < a.length-1; i++){
		
			if(isEven(a[i]) ^ isEven(a[i+1])){
				return 0;
			}
		}
		return 1;
	}

	static boolean isEven(int n) {
		return (n%2==0) ? true : false;
	}	
	public static void main(String[] args) {
		IsWave_Jan09 iw = new IsWave_Jan09();
		
		int[] a = {7,2,9,10,5};
		System.out.println("Is A an wave array? : "+ iw.isWave(a));
		
		int[] b = {4,11,12,1,6};
		System.out.println("Is B an wave array? : "+ iw.isWave(b));
		
		int[] c = {1,0,5};
		System.out.println("Is C an wave array? : "+ iw.isWave(c));
		
		int[] d = {2};
		System.out.println("Is D an wave array? : "+ iw.isWave(d));
		
		int[] e = {5,7};
		System.out.println("Is E an wave array? : "+ iw.isWave(e));

	}

}