package algorithm;

import java.util.Scanner;

public class NumberInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("곱셈에 사용할 첫번째 3자리 자연수(100이상, 1000미만)를 입력하시오: ");
		int n1 = sc.nextInt();
		
		System.out.print("곱셈에 사용할 두번째 3자리 자연수(100이상, 1000미만)를 입력하시오: ");
		int n2 = sc.nextInt();
		
		System.out.print("곱셈에 사용할 세번째 3자리 자연수(100이상, 1000미만)를 입력하시오: ");
		int n3 = sc.nextInt();
	
	
		while(n1 < 100 | n1 >= 1000) {
			System.out.println("3자리 자연수를 입력하세요!");
			System.out.print("곱셈에 사용할 3자리 자연수(100이상, 1000미만)를 입력하시오: ");
			n1 = sc.nextInt();	
		}
		
		while(n2 < 100 | n2 >= 1000) {
			System.out.println("3자리 자연수를 입력하세요!");
			System.out.print("곱셈에 사용할 3자리 자연수(100이상, 1000미만)를 입력하시오: ");
			n2 = sc.nextInt();	
		}
		
		while(n3 < 100 | n3 >= 1000) {
			System.out.println("3자리 자연수를 입력하세요!");
			System.out.print("곱셈에 사용할 3자리 자연수(100이상, 1000미만)를 입력하시오: ");
			n3 = sc.nextInt();	
		}
		
		String temp = n1 * n2 * n3 + "";
		String[] result = null;
		for(int i=0; i<temp.split("").length; i++) {
			result = temp.split("");
		}
		
		int[] cnt = new int[10];
		for(String num : result) {
			switch(num) {
			case "0":
				cnt[0]++;
				break;
			case "1":
				cnt[1]++;
				break;
			case "2":
				cnt[2]++;
				break;
			case "3":
				cnt[3]++;
				break;
			case "4":
				cnt[4]++;
				break;
			case "5":
				cnt[5]++;
				break;
			case "6":
				cnt[6]++;
				break;
			case "7":
				cnt[7]++;
				break;
			case "8":
				cnt[8]++;
				break;
			case "9":
				cnt[9]++;
				break;					
			}
		}
		for(int i=0; i<cnt.length; i++) {
			System.out.println(cnt[i]);
		}
		sc.close();
		
		
		
	}

}
