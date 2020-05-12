package algorithm;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// 하나의 문자열을 입력받아서 이 문자열이 펠린드롬인지 확인하는 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열를 입력하시오: ");
		String palindrome = sc.nextLine();
		int len = palindrome.length();
		int num = 0;
		for( int i = 0; i < len / 2; i += 1) {
			if( palindrome.charAt(i) == palindrome.charAt(len-i-1)) {
				num += 1;
			} else {
				System.out.println("입력하신 문자열 \'" + palindrome + "\' 은(는) Palindrome이 아닙니다.");
				break;
			}	
		}
		if( num == len / 2 ) {
			System.out.println("입력하신 문자열 \'" + palindrome + "\' 은(는) Palindrome 입니다.");
		}
		
		sc.close();

	}

}
