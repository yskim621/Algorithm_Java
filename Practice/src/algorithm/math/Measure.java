package algorithm.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("약수를 구할 자연수(2<=n<=21억)를 입력하시오: ");
		int n = sc.nextInt();
		
		while(n < 2 | n > 2100000000) {
			System.out.print("약수를 구할 자연수(2<=n<=21억)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		/*
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				System.out.printf("%d ", i);
			}
		}
		*/
		
		int sq; // N의 제곱근을 저장하기 위해
		ArrayList<Integer> list = new ArrayList<>(); 
		sq = (int) Math.sqrt(n); // N의 제곱근을 구하여 sq에 저장한다.
		for (int i = 1; i <= sq; i++){
		    if (n % i == 0){
		    	list.add(i); // 작은수 저장
		        if (n / i != i)
		            list.add(n/i); // 큰수 저장 (작은수와 같지 않을 경우)
		    }
		}
		
		list.sort(null);;
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d ", (int) list.get(i));
		}
	}

}
