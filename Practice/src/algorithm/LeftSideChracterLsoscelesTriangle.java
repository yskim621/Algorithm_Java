package algorithm;

import java.util.Scanner;

public class LeftSideChracterLsoscelesTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 홀수(100아하 숫자)를 입력하시오: ");
		int n = sc.nextInt();
		
		while(n % 2 == 0 |n > 100) {
			System.out.println("Input Error!");
			System.out.print("삼각형의 높이로 사용할 홀수(100아하 숫자)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		int sum = 65;
		int[][] arr = new int[n][n]; 
		for(int i=(int) Math.ceil(n/2); i>=0; i--) {
			for(int j=i; j<n-i; j++) {
				if(sum > 90) {
					sum = 65;
				}
				arr[j][i] = sum++;
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				char ch = (char) arr[i][j];
				System.out.printf("%S ", ch);
			}
			System.out.println();
		}
		sc.close();
		
	}

}
