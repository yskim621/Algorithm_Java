package algorithm.shape;

import java.util.Scanner;

public class AdvancedStarTriangle3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 100이하의 홀수를 입력하시오: ");
		int n = sc.nextInt();
		while(n % 2 == 0 || n > 100 ) {
			System.out.println("INPUT ERROR!");
			System.out.print("삼각형의 높이로 사용할 100이하의 홀수를 입력하시오: ");
			n = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(i <= n/2) {
				for(int j=0; j<=3*i; j++) {
					if(j >= i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}	
				}
			} else {
				for(int j=0; j<3*(n-i)-2; j++) {
					if(i+j+2 <= n) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
