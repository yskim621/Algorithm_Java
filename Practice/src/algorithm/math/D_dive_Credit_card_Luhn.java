package algorithm.math;

import java.util.Scanner;

public class D_dive_Credit_card_Luhn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("테스트 케이스로 지정할 숫자를 입력(1<=case<=1000): ");
		int tc = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[tc];
		String[] flag = new String[tc];
		for(int i=0; i<tc; i++) {
			arr[i] = sc.nextLine();
		}
		for(int i=0; i<tc; i++) {
			int sum = 0;
			String[] str = arr[i].split("");
			int[] num = new int[str.length];
			for(int j=0; j<str.length; j++) {
				num[j] = Integer.parseInt(str[j]);
				if(j%2 == 0) {
					num[j] *= 2;  
					if(num[j] > 10) {
						num[j] = (num[j]%10) + 1;
					}
				}
				sum += num[j];
			}
			if(sum%10 == 0) {
				flag[i] = "T";
			} else {
				flag[i] = "F";
			}
		}
		for(String temp : flag) {
			System.out.println(temp);
		}
	}

}
