package algorithm.shape;

import java.util.Scanner;

public class OptionalNumberTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 자연수(100아하 홀수)를 입력하시오: ");
		int n = sc.nextInt();
		while(n > 100 || n % 2 == 0) {
			System.out.println("INPUT ERROR!");
			System.out.print("삼각형의 높이로 사용할 자연수(100아하 홀수)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		System.out.print("종류를 선택할 숫자(3아하)를 입력하시오: ");
		int m = sc.nextInt();
	
		while(m < 1 | m > 3) {
			System.out.println("1이상, 3이하의 자연수를 입력하세요!");
			System.out.print("종류를 선택할 숫자(3아하)를 입력하시오: ");
			m = sc.nextInt();
		}
		
		int temp;
		int sum = 1;
		switch(m) {
		case 1:
			for(int i=0; i<n; i++) {
				if(i % 2 == 0) {
					for(int j=0; j<=i; j++) {
						System.out.printf("%2d ", sum++);
					}
				} else {
					sum += i;
					temp = sum;
					for(int j=0; j<=i; j++) {
						System.out.printf("%2d ", sum--);
					}
					sum = temp + 1;
				}
				System.out.println();
			}
			break;
		case 2:
			for(int i=0; i<n; i++) {
				for(int j=0; j<i; j++) {
					System.out.printf("%s ", " ");
				}
				for(int j=i; j<n; j++) {
					System.out.printf("%d ", i);
				}
				for(int j=i; j<n-1; j++) {
					System.out.printf("%d ", i);
				}
				System.out.println();
			}
			break;
		case 3:
			for(int i=0; i<n; i++) {
				sum = 1;
				if(i <= n/2) {
					for(int j=0; j<=i; j++) {
						System.out.printf("%d ", sum++);
					}
				} else {
					for(int j=0; j<n-i; j++) {
						System.out.printf("%d ", sum++);
					}
				}
				System.out.println();
			}
			break;
		}
		sc.close();
	}

}
