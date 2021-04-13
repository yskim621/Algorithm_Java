package algorithm.math;

import java.util.Scanner;

public class GCD_And_LCM2 {
	
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
		double lcm =  Double.parseDouble(arr[0]) * Double.parseDouble(arr[1]) / gcd;
		for(int i=2; i<arr.length; i++) {
			gcd = gcd_get(gcd, Integer.parseInt(arr[i]));
			lcm = lcm * Double.parseDouble(arr[i]) / gcd;
		}
		
		if(lcm >= 2000000000) {
			System.out.println("최소공배수가 int의 데이터 크기 형식인 20억을 넘는 수이므로 다른 수로 다시 진행하시길 바랍니다.");
		} else {
			System.out.printf("%d %d", gcd, (int)lcm);
		}

 		/* Hint
 		 gcd = lcm = a[0];
		 for (i=1; i < N; i++) { 
    	  	gcd = gcd_get(gcd, a[i]); 
    		lcm = lcm / gcd_get(lcm, a[i]) * a[i];
		 }
 		 */
		
		sc.close();
	}
	
	
}
