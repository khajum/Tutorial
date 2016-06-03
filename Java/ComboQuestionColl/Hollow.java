/*+
1. Count no of zero element in array.
2. Count no of non zero element at the beginnning.
3. Count no of non zero element at the end..
4. if beginNonZeroCount = endNonZeroCount and zeroCount>=3 then return 1
*/
public class Hollow {

	public static void main(String[] args) {
			//int retVal = isHollow(new int[]{1,2,4,0,0,0,3,4,5});
			int retVal = isHollow(new int[]{1,2,4,9, 0,0,0,3,4, 5});
	 
			System.out.println(retVal);
	}
	
	static int isHollow(int[] a) {
		int beginNonZeroCount =0, endNonZeroCount=0, zeroCount=0;
		
		for(int val : a) {
			if(val == 0){
				zeroCount++;
			}
		}		
		
		for(int val : a) {
			if(val == 0){
				break;
			} else {
				beginNonZeroCount++;
			}
		}

		for(int i = a.length-1; i>=0; i--) {
			if(a[i] == 0){
				break;
			} else {
				endNonZeroCount++;
			}
		}

		return (beginNonZeroCount == endNonZeroCount && zeroCount>=3) ? 1 : 0;	
		
	}

}

 