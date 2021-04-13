package algorithm.math;

import java.util.ArrayList;
import java.util.Scanner;

public class GCD_And_LCM2 {
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
		System.out.print("약수와 배수 관계를 정할 정수의 개수 n(2이상, 10이하)을 입력하시오: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		while(n < 2 | n > 10) {
			System.out.print("약수와 배수 관계를 정할 정수의 개수 n(2이상, 10이하)을 입력하시오: ");
			n = sc.nextInt();
			sc.nextLine();
		}
		
		
		System.out.print("약수와 배수 관계에 사용될 정수를 차례로 입력하시오(정수 사이는 공백으로 구분): ");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		while(arr.length != n) {
			System.out.print("약수와 배수 관계에 사용될 정수를 차례로 입력하시오(정수 사이는 공백으로 구분)[ex(n=6) 2 3 5 12 18 24]: ");
			str = sc.nextLine();
			arr = str.split(" ");
		}
		
		int gcd = gcd_get(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
		int lcm =Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]) / gcd;
		for(int i=2; i<arr.length; i++) {
			gcd = gcd_get(gcd, Integer.parseInt(arr[i]));
			lcm = lcm  * Integer.parseInt(arr[i]) / gcd;
		}
 		
		System.out.printf("%d %d", gcd, lcm);
		
		
		
		
		
		
		sc.close();
	}
	
	
}
