public class MinDistance_Jan09 {

	int minDistance(int num){
		int minDist = Integer.MAX_VALUE;
		int preNonTrivFactor = 0, nonTrivFactor = 1;
		int dist = 0, noOfFactor=0;
		
		for(int i = 2; i < num; i++){
			if(num%i == 0){
				preNonTrivFactor = nonTrivFactor;
				nonTrivFactor = i;	
				noOfFactor++;				
				dist = nonTrivFactor - preNonTrivFactor;
				if(dist < minDist){
					minDist = dist;
				}
			}
		}
		
		if (noOfFactor == 1)
			return 0;
		else if (noOfFactor == 0)
			return -1;
			
		return minDist;
	}
	public static void main(String[] args) {
		MinDistance_Jan09 d = new MinDistance_Jan09();
		
		System.out.println("MinDistance of Factors of 63 : " + d.minDistance(63));
		
		System.out.println("MinDistance of Factors of 25 : " + d.minDistance(25));
		System.out.println("MinDistance of Factors of 11 : " + d.minDistance(11));

	}

}