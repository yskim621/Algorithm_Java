package algorithm.shape;

import java.util.Scanner;

public class OptionalStarTriangle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 100이하의 홀수를 입력하시오: ");
		int n = sc.nextInt();
		while(n % 2 == 0 || n > 100 ) {
			System.out.println("INPUT ERROR!");
			System.out.print("삼각형의 높이로 사용할 100이하의 홀수를 입력하시오: ");
			n = sc.nextInt();
		}
		
		System.out.print("종류를 선택할 숫자(4아하)를 입력하시오: ");
		int m = sc.nextInt();
	
		while(m > 4) {
			System.out.println("4이하의 정수를 입력하세요!");
			System.out.print("종류를 선택할 숫자(4아하)를 입력하시오: ");
			m = sc.nextInt();
		}
		
		switch(m) {
		case 1:
			for(int i=0; i<n; i++) {
				if(i <= n/2) {
					for(int j=0; j<=i; j++) {
						System.out.print("*");
					}
				} else {
					for(int j=0; j<n-i; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			break;
		case 2:
			for(int i=0; i<n; i++) {
				if(i <= n/2) {
					for(int j=0; j<(int)Math.ceil(n/2)-i; j++) {
						System.out.print(" ");
					}
					for(int j=0; j<=i; j++) {
						System.out.print("*");
					}
				} else {
					for(int j=0; j<i-(int)Math.ceil(n/2); j++) {
						System.out.print(" ");
					}
					for(int j=0; j<n-i; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			break;
		case 3:
			for(int i=0; i<n; i++) {
				if(i <= n/2) {
					for(int j=0; j<i; j++) {
						System.out.print(" ");
					}
					for(int j=0; j<=(int)Math.ceil(n/2)-i; j++) {
						System.out.print("*");
					}
					for(int j=(int)Math.ceil(n/2); j<n-i-1; j++) {
						System.out.print("*");
					}
				} else {
					for(int j=0; j<n-i-1; j++) {
						System.out.print(" ");
					}
					for(int j=0; j<=i-(int)Math.ceil(n/2); j++) {
						System.out.print("*");
					}
					for(int j=(int)Math.ceil(n/2); j<i; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			break;
		case 4:
			for(int i=0; i<n; i++) {
				if(i <= n/2) {
					for(int j=0; j<i; j++) {
						System.out.print(" ");
					}
					for(int j=0; j<=(int)Math.ceil(n/2)-i; j++) {
						System.out.print("*");
					}
				
				} else {
					for(int j=0; j<(int)Math.floor(n/2); j++) {
						System.out.print(" ");
					}
					for(int j=(int)Math.floor(n/2); j<=i; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			break;	
		}
		sc.close();
	}

}
