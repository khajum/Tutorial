public class EvenSubset_Dec05 {

	int isEvenSubset(int m, int n){
		for(int i=2; i< m; i+=2){
			if(m%i == 0 && n%i != 0){
					return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		EvenSubset_Dec05 es = new EvenSubset_Dec05();
		
		System.out.println("Is 18 even subset of 12 ? : " + es.isEvenSubset(18, 12));
		
		System.out.println("Is 18 even subset of 32 ? : " + es.isEvenSubset(18, 32));

	}

}
