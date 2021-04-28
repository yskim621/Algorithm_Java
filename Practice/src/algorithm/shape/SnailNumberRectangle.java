package algorithm.shape;

import java.util.Scanner;

public class SnailNumberRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각형의 한 변으로 사용할 자연수(1이상, 100아하)를 입력하시오: ");
		int n = sc.nextInt();
		while(n < 1 || n > 100 ) {
			System.out.println("INPUT ERROR!");
			System.out.print("정사각형의 한 변으로 사용할 자연수(1이상, 100아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		sc.nextLine();
		
		int sum = 1;
		int x =0, y=-1;
		int[][] arr = new int[n+1][n+1];
		for(int i=0; i<2*n-1; i++) {
			int ceil = (int)Math.ceil((i+1)/2);
			for(int j=0; j<n-ceil; j++) {
				if(i % 4 == 0) {
					++y;
				} else if(i % 4 == 1) {
					++x;
				} else if(i % 4 == 2) {
					--y;
				} else {
					--x;
				}
				arr[x][y] += sum++;
				//System.out.println("arr["+x+"]"+"["+y+"] = "+arr[x][y]);
			}
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
