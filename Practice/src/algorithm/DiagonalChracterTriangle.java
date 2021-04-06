package algorithm;

import java.util.Scanner;

public class DiagonalChracterTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 숫자(100아하)를 입력하시오: ");
		int n = sc.nextInt();
		
		while(n > 100) {
			System.out.println("100이하의 정수를 입력하세요!");
			System.out.print("삼각형의 높이로 사용할 숫자(100아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		int sum = 65;
		int[][] arr = new int[n][n]; 
		for(int i=0; i<n; i++) {
			for(int j=i, k=n; j<n; j++, k--) {
				if(sum > 90) {
					sum = 65;
				}
				arr[j][k-1] = sum++;
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				char ch = (char) arr[i][j];
				System.out.printf("%S ", ch);
			}
			System.out.println();
		}
	}

}
