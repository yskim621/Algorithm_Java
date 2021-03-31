package algorithm;

import java.util.Scanner;

public class TwistedNumberRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자사각형의 높이로 사용할 숫자(100아하)를 입력하시오: ");
		int n = sc.nextInt();
		System.out.print("숫자사각형의 너비로 사용할 숫자(100이하)를 입력하시오: ");
		int m = sc.nextInt();
		
		if(n > 100) {
			System.out.println("100이하의 정수를 입력하세요!");
			System.out.print("숫자사각형의 높이로 사용할 숫자(100아하)를 입력하시오: ");
			n = sc.nextInt();
		}
		
		if(m > 100) {
			System.out.println("100이하의 정수를 입력하세요!");
			System.out.print("숫자사각형의 너비로 사용할 숫자(100아하)를 입력하시오: ");
			m = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=1; i <= n; i++){
		    if(i % 2 != 0) {
		    	for(int j = 0; j < m; j++){
			    	System.out.printf("%d ", ++sum);
			    }
		    	sum += m; 
		    } else {
		    	for(int j = 0; j < m; j++){
			    	System.out.printf("%d ", sum - j);
			    }
		    }
		    System.out.println();
		}
	}
}
