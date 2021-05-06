package algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeupProblems {

	public static void main(String[] args) {
		System.out.println("\u250C\u252C\u2510\n\u251C\u253C\u2524\n\u2514\u2534\u2518");
	
		Scanner sc = new Scanner(System.in);
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d %d", a, b);
		
		
		String x = sc.nextLine();
		StringTokenizer st = new StringTokenizer(x, " ");
		String y = st.nextToken();
		String z = st.nextToken();
		System.out.printf("%s %s", z, y);
		
		double x = sc.nextDouble();
		System.out.printf("%.2f", x);
		
		
		int x = sc.nextInt();
		System.out.printf("%d %d %d", x, x, x);
		
		
		String dateTime = sc.nextLine();
		System.out.printf("%s", dateTime);
		
		
		String x = sc.nextLine();
		StringTokenizer st = new StringTokenizer(x, "-");
		String y = st.nextToken();
		String z = st.nextToken();
		System.out.printf("%s%s", y, z);
		
		String x = sc.nextLine();
		int y = Integer.parseUnsignedInt(x);
		System.out.printf("%s", Integer.toUnsignedString(y));
		*/
		
		String x = sc.nextLine();
		String[] temp = x.split("");
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
			System.out.println("[" + arr[i] * (int) Math.pow(10, arr.length-1-i) + "]");
		}
		
		
		
		sc.close();
		
		
	}

}
