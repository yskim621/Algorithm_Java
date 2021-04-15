package algorithm.shape;

import java.util.Scanner;

public class SnailNumberTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이로 사용할 양의 자연수(100아하)를 입력하시오: ");
		int n = sc.nextInt();
		while(n > 100 || n < 1) {
			System.out.println("INPUT ERROR!");
			System.out.print("삼각형의 높이로 사용할 양의 자연수(100아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		int temp;
		int sum = 48;
		int[][] arr = new int[n][n];
		for(int k=0; k<n/3; k++) {
			for(int i=2*k; i<n-k; i++) {
				for(int j=k; j<=i; j++) {
					sum = change(sum);
					if(i - k == j) {
						arr[i][j] = sum++;
					}
				}
			}
			for(int i=0; i<n; i++) {
				for(int j=0; j<i-(2*k); j++) {
					sum = change(sum);
					if(i == n-1-k && i != j) {
						arr[i][n-j-2-(2*k)] = sum++;
					}
				}
			}
			for(int i=k; i<n-1-(2*k); i++) {
				for(int j=k; j<=i; j++) {
					sum = change(sum);
					if(j-k == 0 && i != j ) {
						arr[n-i-1][j] = sum++;
					} 
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
	}
	
	public static int change(int sum) {
		switch(sum) {
		case 47:
		case 67:
			sum = 57;
			break;
		case 46:
		case 66:
			sum = 56;
			break;
		case 45:
		case 65:
			sum = 55;
			break;
		case 44:
		case 64:
			sum = 54;
			break;	
		case 43:
		case 63:
			sum = 53;
			break;
		case 42:
		case 62:
			sum = 52;
			break;
		case 41:
		case 61:
			sum = 51;
			break;
		case 40:
		case 60:
			sum = 50;
			break;
		case 39:
		case 59:
			sum = 49;
			break;
		case 38:
		case 58:
			sum = 48;
			break;
		}
		return sum;
	}
}


