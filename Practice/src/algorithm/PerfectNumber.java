package algorithm;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int cnt = 0;
		for ( int i = 2; i <= 1000; i += 1 ) {
			int sum = 0;
			for( int j = 1; j <= i / 2; j += 1) {
				if( i % j == 0) {
					sum += j;	
				}
			}
			if( sum == i) {		
				cnt += 1;
				System.out.printf("%5d", i);
			}	
			
		}
		System.out.println("\n완전 수의 총 개수: " + cnt );
	}

}
