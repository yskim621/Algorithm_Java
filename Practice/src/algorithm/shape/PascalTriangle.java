package algorithm.shape;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pascal 삼각형의 높이로 사용할 자연수(1이상, 30아하)를 입력하시오: ");
		int n = sc.nextInt();
		while(n < 1 || n > 30 ) {
			System.out.println("INPUT ERROR!");
			System.out.print("Pascal 삼각형의 높이로 사용할 자연수(1이상, 30아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		sc.nextLine();
		
		int[][] arr = new int[n][2*n];
		int a, b, c, d;
		
		for(int i=0; i<(int)Math.ceil(n/2)+1; i++) {
			if(i == 0) {
				a = 0;
				b = n-1;
				c = 0;
				d = n-1;
				for(int j=0; j<n; j++) {
					arr[a++][b--] = 1;
					arr[c++][d++] = 1;
				}
			} else {
				a = 2*i-1;
				b = n;
				c = 2*i-1;
				d = n-2;
				for(int j=0; j<n-2*i; j++) {
					arr[++a][--b] = arr[a-1][b-1]+arr[a-1][b+1];
					arr[++c][++d] = arr[c-1][d-1] + arr[c-1][d+1];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <2*n-1; ++j) { 
				if(arr[i][j] != 0) {
					System.out.printf("%d", arr[i][j]);	
				} else {
					System.out.printf("%s", " ");
				}
			}
			System.out.println();
		}
	}

}
