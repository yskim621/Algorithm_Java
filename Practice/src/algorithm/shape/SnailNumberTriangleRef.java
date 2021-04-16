package algorithm.shape;

import java.util.Scanner;

public class SnailNumberTriangleRef {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 양의 자연수(100아하)를 입력하시오: ");
		int N = sc.nextInt(); // 삼각형의 높이
		int arr[][] = new int[N][N]; // 입력받은 크기의 배열 생성
		int x = -1, y = -1; // arr[0][0]에 넣기 위해 '-1'로 초기화
		int num = 0; // 출력할 수

		for (int i = 0; i < N; ++i) {
			for (int j = i; j < N; ++j) {
				if (i % 3 == 0) { // 대각선, 밑변, 높이 순서대로 이동하는 규칙을 활용
					x++; // x,y의 각각 증가를 통한 대각선 이동
					y++;
				} else if (i % 3 == 1) { // y 감소를 통한 밑변에서의 이동
					y--;
				} else if (i % 3 == 2) { // x 감소를 통한 높이에서의 이동
					x--;
				}
				arr[x][y] = (num++) % 10; // 10초과시 1의 자리만 출력

				System.out.println("arr["+x+"]"+"["+y+"] = "+arr[x][y]); //확인을 위한 코드
			} // end of in_for

		} // end of out_for

		// 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; ++j) { // 대각선 기준 좌하단만 출력
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}	
}


