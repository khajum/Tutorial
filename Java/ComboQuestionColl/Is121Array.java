public class Is121Array{

	public static void main(String[] args) {
		int[] a = new int[]{1, 1, 2, 2, 2, 1, 1, 1};
		
		System.out.println(is121Array(a));
	}
	
	static int is121Array(int a[]) {
		int is1stOne = 0;
		int isMiddleTwo = 0;
		int isLastOne = 0;
		int firstOneCount = 0;
		int lastOneCount = 0;
				
		if(a[0] == 1 && a[a.length0] == 1) {
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