package algorithm;

import java.util.Scanner;

public class MeasureAndDrainage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("약수와 배수 관계를 정할 정수의 개수 n(1이상, 40이하)을 입력하시오: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		while(n < 1 | n > 40) {
			System.out.print("약수와 배수 관계를 정할 정수의 개수 n(1이상, 40이하)을 입력하시오: ");
			n = sc.nextInt();	
		}
		
		System.out.print("약수와 배수 관계에 사용될 정수를 차례로 입력하시오(정수 사이는 공백으로 구분): ");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		while(arr.length != n) {
			System.out.print("약수와 배수 관계에 사용될 정수를 차례로 입력하시오(정수 사이는 공백으로 구분)[ex(n=6) 2 3 5 12 18 24]: ");
			str = sc.nextLine();
			arr = str.split(" ");
		}
		
		
		System.out.print("약수와 배수를 구할 기준 정수(1이상, 100이하)를 입력하시오: ");
		int m = sc.nextInt();
	
		while(m < 1 | m > 100) {
			System.out.print("약수와 배수를 구할 기준 정수(1이상, 100이하)를 입력하시오: ");
			m = sc.nextInt();	
		}
		
		
		int measureSum = 0, drainageSum = 0;
		for(int i=0; i<n; i++) {
			if(m % Integer.parseInt(arr[i]) == 0) {
				measureSum += Integer.parseInt(arr[i]);
			}
			if(Integer.parseInt(arr[i]) % m == 0) {
				drainageSum += Integer.parseInt(arr[i]);
			}
		}
		
		System.out.println(measureSum);
		System.out.println(drainageSum);
	}

}
