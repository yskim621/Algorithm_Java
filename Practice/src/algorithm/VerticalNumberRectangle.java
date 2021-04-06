package algorithm;

import java.util.Scanner;

public class VerticalNumberRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각형의 변으로 사용할 숫자(100아하)를 입력하시오: ");
		int n = sc.nextInt();
		
		while(n > 100) {
			System.out.println("100이하의 정수를 입력하세요!");
			System.out.print("정사각형의 변으로 사용할 숫자(100아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		int sum = 1;
		int[][] arr = new int[n][n]; 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[j][i] = sum++;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
