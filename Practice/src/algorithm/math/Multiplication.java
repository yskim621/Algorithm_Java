package algorithm.math;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("곱셈에 사용할 첫번째 3자리 자연수를 입력하시오: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("곱셈에 사용할 두번째 3자리 자연수를 입력하시오: ");
		String m = sc.nextLine();
		
		int result;
		
		String var3 = m.substring(2);
		int num3 = Integer.parseInt(var3) * n;
		
		String var4 = m.substring(1, 2);
		int num4 = Integer.parseInt(var4) * n;
		
		String var5 = m.substring(0, 1);
		int num5 = Integer.parseInt(var5) * n;
		
		int num6 = num3 + (num4 * 10) + (num5 * 100);
		
		sc.close();
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
	}

}
