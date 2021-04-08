package algorithm;

import java.util.Scanner;

public class FindingMeasure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("약수를 구할에 자연수를 차례로 입력(수 사이는 공백으로 구분, 첫번째는 1이상 10,000이하, 두번째는 1이상 첫번째 수이하)[ex)6 3]: ");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		while(N < 1 | N > 10000 | K < 1 | K > N) {
			System.out.print("약수를 구할에 자연수를 차례로 입력(수 사이는 공백으로 구분)[ex)6 3]: ");
			str = sc.nextLine();
			arr = str.split(" ");
		}
		
		if(N % K == 0) {
			System.out.println(K);
		} else {
			System.out.println(0);
		}
		
	}

}
