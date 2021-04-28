package algorithm.shape;

import java.util.Scanner;

public class CharacterRhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("마름모의 변으로 사용할 양의 정수(100아하)를 입력하시오: ");
		int n = sc.nextInt();
		
		while(n > 100) {
			System.out.println("100이하의 양의 정수를 입력하세요!");
			System.out.print("마름모의 변으로 사용할 양의 정수(100아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		int sum = 65;
		int x = -1, y= 4;
		int[][] arr = new int[n+3][n+3]; 
		for(int i=0; i<3*n; i++) {
			int ceil = (int)Math.ceil((i+1)/2);
			int floor = (int) Math.floor(i/4);
			//System.out.println(floor);
			for(int j=0; j<n - ceil; j++) {
				if(sum > 90) {
					sum = 65;
				}
				if(i % 4 == 0) {
					++x;
					--y;
					//x -= (int) Math.floor(i/4);
				} else if(i % 4 == 1) {
					++x;
					++y;
				} else if(i % 4 == 2) {
					--x;
					++y;
				} else {
					--x;
					--y;
				}
				arr[x][y] += sum++;
				System.out.println("arr["+x+"]"+"["+y+"] = "+arr[x][y]);
			}
			
		}
		
		
		for(int i=0; i<n+3; i++) {
			for(int j=0; j<n+3; j++) {
				char ch = (char) arr[i][j];
				System.out.printf("%S ", ch);
			}
			System.out.println();
		}
		
		sc.close();
			
	}

}
