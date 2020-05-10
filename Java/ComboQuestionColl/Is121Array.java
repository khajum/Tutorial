public class Is121Array{

	public static void main(String[] args) {

		System.out.println(is121Array(new int[]{1, 2, 1}));
		System.out.println(is121Array(new int[] {1, 1, 2, 2, 2, 1, 1}));
		System.out.println(is121Array(new int[] {1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
		System.out.println(is121Array(new int[] {1, 1, 1, 1, 1, 1}));
		System.out.println(is121Array(new int[] {2, 2, 2}));
		System.out.println(is121Array(new int[] {1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
	}
	
	static int is121Array(int[] a){
		boolean hasTwo = false;
		int endOneCount=0, beginOneCount=0;
		// return 0, if first and last element is not 1
		if(a[0] != 1 && a[a.length-1] !=1)
			return 0;
		
		// return 0, if elements are not either 1 or 2.	
		for(int val : a){
			if(val!= 1 && val!=2)
				return 0;
		}
		
		// return 0, if atleast one of element is not 2
		for(int val  : a){
			if(val ==2){
				hasTwo = true;
				break;
			}	
		}
		
		if (hasTwo == false)
			return 0;
		//count no of first 1s
		for(int i = 0; a[i] == 1; i++)
			beginOneCount++;

		//count no of last 1s
		for(int i=a.length-1; a[i]==1; i--){
				endOneCount++;
		}
		
		return (beginOneCount == endOneCount)?1:0;
	}
	
	static int is121Array1(int a[]) {
		int is1stOne = 0;
		int isMiddleTwo = 0;
		int isLastOne = 0;
		int firstOneCount = 0;
		int lastOneCount = 0;
				
		if(a[0] == 1 && a[a.length] == 1) {
			is1stOne = 1;
			isLastOne = 1;			
		} else {
			return 0;
			
		}
		
			
		if(is1stOne ==1 &&  isLastOne==1) {
		
			for(int i = 0; i<a.length; i++) {
				if(is1stOne == 1 && a[i] == 1) {
					firstOneCount+=1;
					isMiddleTwo = 1;
				} else if(isMiddleTwo == 1 && a[i] ==2){
					is1stOne = 0;						
				} else if(isLastOne == 1 && a[i] == 1) {
					isMiddleTwo = 0;
					lastOneCount+=1;
				} else {
					return 0;
					
				}
			}
			
		} else {
			return 0;
		}
		
		System.out.println(firstOneCount+"="+lastOneCount);
		
		if (firstOneCount == lastOneCount) {
			return 1;
		} else 
		{
			return 0;
		}
	
	}
}