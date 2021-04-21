package algorithm.shape;

import java.util.Scanner;

public class OptionalPascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 자연수(1이상, 30아하)를 입력하시오: ");
		int n = sc.nextInt();
		while(n < 1 || n > 30 ) {
			System.out.println("INPUT ERROR!");
			System.out.print("삼각형의 높이로 사용할 자연수(1이상, 30아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		System.out.print("종류를 선택할 숫자(4아하)를 입력하시오: ");
		int m = sc.nextInt();
	
		while(m > 4) {
			System.out.println("4이하의 자연수를 입력하세요!");
			System.out.print("종류를 선택할 숫자(4아하)를 입력하시오: ");
			m = sc.nextInt();
		}
		int x = 0, y = 0;
		
		
		switch(m) {
		case 1:
			int[][] arr = new int[n][n];
			for(int i=0; i<(int)Math.ceil(n/2)+1; i++) {
				for(int j=0; j<=i; j++) {
					if(j == 0 || j == i) {
						arr[i][j] = 1;
						System.out.printf("%d ", arr[i][j]);
					} else {
						arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
					}
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
		case 4:
			
			break;
		}
		sc.close();
	}

}
