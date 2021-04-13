package algorithm.shape;

import java.util.Scanner;

public class OptionalStarTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 숫자(100아하)를 입력하시오: ");
		int n = sc.nextInt();
		while(n > 100) {
			System.out.println("INPUT ERROR!");
			System.out.print("정사각형의 변으로 사용할 숫자(100아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		System.out.print("종류를 선택할 숫자(3아하)를 입력하시오: ");
		int m = sc.nextInt();
	
		while(m > 3) {
			System.out.println("3이하의 정수를 입력하세요!");
			System.out.print("종류를 선택할 숫자(3아하)를 입력하시오: ");
			m = sc.nextInt();
		}
		
		switch(m) {
		case 1:
			for(int i=0; i<n; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2:
			for(int i=0; i<n; i++) {
				for(int j=0; j<n-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 3:
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=2*n-1; j++) {
					if(j >= n - i + 1 && j <= n + i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			break;
		}
		sc.close();
	}

}
