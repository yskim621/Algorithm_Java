package algorithm;

import java.util.Scanner;

public class PrintPracticing3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열을 입력하시오: ");
		String word = sc.nextLine();
		
		int sum = 0;
		int result = 0;
		String[] str = word.split(" ");
		int[] arr = new int[str.length];
		for(int i=0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
			sum += arr[i];
			for(int j=i; j<arr.length; j++) {
				
			}
		}
		if(arr.length % 2 != 0) {
			sum += sum;
		}
		
		
		
		System.out.println("sum: " + sum);
		
		
		
		
		
		
		
	}

}
