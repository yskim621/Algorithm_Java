package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class GCD_And_LCM {
	/* Second Method
	static int gcd_get(int x, int y){
	    int i, ans = 0;
	    for (i = 1; i <= x; i++){
	        if (x % i == 0 && y % i == 0){
	            ans = i;
	        }
	    }
	    return ans;
	}
	*/
	
	/* Third Method
	 * 유클리드 호제법(Euclidean algorithm) : 
		A를 B로 나눈 나머지가 r이라면 A와 B의 최대공약수는 B와 r의 최대공약수와 동일.
		GCD(A, B) = GCD(B, r) 이 원리를 이용하면 두 수의 최대공약수를 도출 용이. 
	static int gcd_get(int x, int y){
	    int r;
	    while (y!=0){   // y 0이면 x가 최대공약수이므로 종료한다.
	        r = x % y; // 나머지를 구한후
	        x = y; // x를 y로
	        y = r; // y를 r로 바꾸고 다시 반복한다.
	    }
	    return x; // 최대공약수를 리턴한다.
	}
	*/
	
	static int gcd_get(int x, int y){
	    if(y == 0) return x; // y 0이면 x가 최대공약수이다.
	    return gcd_get(y, x % y); // x와 y의 최대공약수는 y와 x % y 의 최대공약수와 같다.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("최소공배수와 최대공약수를 구할 두 자연수(10000이하)를 차례로 입력(수 사이는 공백으로 구분)[ex)6 3]: ");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		while(N < 1 | N > 10000 | K < 1 | K > 10000) {
			System.out.print("최소공배수와 최대공약수를 구할 두 자연수(10000이하)를 차례로 입력(수 사이는 공백으로 구분)[ex)6 3]: ");
			str = sc.nextLine();
			arr = str.split(" ");
		}
		
		/* Code myself at beginning
		ArrayList<Integer> gcd_list = new ArrayList<>();
		if(N < K) {
			for(int i=1; i<=N; i++) {
				if(N % i == 0 & K % i == 0) {
					gcd_list.add(i);
				}
			}
		} else {
			for(int i=1; i<=K; i++) {
				if(N % i == 0 && K % i == 0) {
					gcd_list.add(i);
				}
			}
		}
		int gcd = gcd_list.get(gcd_list.size()-1);
		int lcm = N * K / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
		*/
		
		int gcd = gcd_get(K, N);
		int lcm = K * N / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
		
		
		
		
		
		sc.close();
	}
	
	
}
