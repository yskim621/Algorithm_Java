package algorithm.shape;

import java.util.Scanner;

public class VerticalTwistedCharacterRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각형의 변으로 사용할 숫자(100아하)를 입력하시오: ");
		int n = sc.nextInt();
		
		while(n > 100) {
			System.out.println("100이하의 정수를 입력하세요!");
			System.out.print("정사각형의 변으로 사용할 숫자(100아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		int sum = 65;
		int[][] arr = new int[n][n]; 
		for(int i=0; i<n; i++) {
			if(i % 2 != 0) {
				for(int j=0; j<n; j++) {
					if(sum > 90) {
						sum = 65;
					}
					arr[n-j-1][i] = sum++;
				}
			} else {
				for(int j=0; j<n; j++) {
					if(sum > 90) {
						sum = 65;
					}
					arr[j][i] = sum++;
				}
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
