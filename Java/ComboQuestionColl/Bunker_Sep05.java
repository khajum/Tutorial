/*

1. An integer is defined to be a Bunker number if it is an element in the infinite sequence 1, 2, 4, 7, 11, 16, 22, … 
Note that 2-1=1, 4-2=2, 7-4=3, 11-7=4, 16-11=5 so for k>1, the kth element of the sequence is equal to the k-1th element + k-1. 
E.G., for k=6, 16 is the kth element and is equal to 11 (the k-1th element) + 5 (k-1).

*/

public class Bunker_Sep05{

	public static void main(String[] args) {
		System.out.println(isBunker(11));
		System.out.println(isBunker(22));
		System.out.println(isBunker(8));
	
	}
	
	static int isBunker(int n) {
		int sum = 1;
		for(int i = 1; i<=sum; i++){
			if(sum == n)
				return 1;
			sum+=i;	
		}

		return 0;
	}
}