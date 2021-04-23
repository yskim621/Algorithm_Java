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
		
		int[][] arr = new int[n+1][2*n];
		int x = -1, y = n;
		
		for(int i=0; i<(int)Math.ceil(n/2)+1; i++) {
			if(i == 0) {
				for(int j=0; j<n; j++) {
					x++;
					y--;
					arr[x][y] = 1; 
				}
				x = 0;
				y = n-1;
				for(int j=0; j<n-1; j++) {
					x++;
					y++;
					arr[x][y] = 1;
				}
			} else {
				x = 2*i-1;
				y = n;
				for(int j=0; j<n-2*i; j++) {
					x++;
					y--;
					arr[x][y] = arr[x-1][y-1] + arr[x-1][y+1];
				}
				x = 2*i-1;
				y = n-2;
				for(int j=0; j<n-2*i; j++) {
					x++;
					y++;
					arr[x][y] = arr[x-1][y-1] + arr[x-1][y+1];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <2*n-1; ++j) { 
				if(arr[i][j] != 0) {
					System.out.printf("%d ", arr[i][j]);	
				} else {
					System.out.printf("%s ", " ");
				}
			}
			System.out.println();
		}
	}

}
