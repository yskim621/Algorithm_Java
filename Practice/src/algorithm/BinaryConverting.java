package algorithm;

import java.util.*;

public class BinaryConverting {

	public static void main(String[] args) {
		// 배열이나 리스트를 이용해서 0-1023 사이의 정수를 입력했을 때 이 숫자를 이진수로 변환해서 출력하기 - 무조건 10자리로 출력
		Stack <String> stack = new Stack <>();
		Scanner sc = new Scanner(System.in);
		System.out.print("0-1023사이의 정수를 입력하시오: ");
		int num = sc.nextInt();
		String ar = "";
		while( true ) {
			int sum = num / 2;
			if( num / 2 == 0) {
				ar += num % 2;
				break;
			} else {
				ar += num % 2;
			}
			num = sum;
		}
		for( int i = 0; i < ar.length(); i += 1) {
			stack.push("" + ar.charAt(i));
		}
		
		String data = ""; 
		System.out.printf("입력하신 숫자의 이진수 값: ");
		int len = stack.size();
		try {
			for(int i = 0; i< len; i = i + 1) {
				data += stack.pop();
			};
			int result = Integer.parseInt(data);
			System.out.printf("%010d", result);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}	
		System.out.printf("\n");
		
		sc.close();

	}

}
