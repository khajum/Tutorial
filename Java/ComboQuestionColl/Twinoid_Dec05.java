public class Twinoid_Dec05 {

	int isTwinoid(int[] a){
		int evenCnt = 1;
		int MaxAdjevenCnt=0;
		for(int i = 1; i < a.length; i++){
			if(a[i-1]%2 == 0 && a[i]%2 == 0) {
				evenCnt++;
			} else {
				if(evenCnt>MaxAdjevenCnt)
					MaxAdjevenCnt = evenCnt;
				evenCnt=1;
			}
		}
		
		if(evenCnt>MaxAdjevenCnt)
					MaxAdjevenCnt = evenCnt;
					
		if(MaxAdjevenCnt == 2){
			return 1;
		} else {
			return 0;
		}
	
	}
	public static void main(String[] args) {
		Twinoid_Dec05 twin = new Twinoid_Dec05();
		int[] a = {3,3,2,6,7};
		System.out.println("Is A twinoid array? : " + twin.isTwinoid(a));
		
		int[] b = {3,3,2,6,6,7};
		System.out.println("Is b twinoid array? : " + twin.isTwinoid(b));
		
		int[] c = {3,3,2,7,6,7};
		System.out.println("Is c twinoid array? : " + twin.isTwinoid(c));
		
		int[] d = {3,8,4,5,7,3,4,6};
		System.out.println("Is d twinoid array? : " + twin.isTwinoid(d));

	}

}