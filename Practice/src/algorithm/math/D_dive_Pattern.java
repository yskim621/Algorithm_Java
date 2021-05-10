package algorithm.math;

import java.util.Scanner;

public class D_dive_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("규칙을 위한 임의의 숫자를 입력(3<=case<=1000): ");
		int num = sc.nextInt();
		if(num%2 == 1) {
			for(int i=0; i<num; i++) {
				for(int j=0; j<num; j++) {
					if(i == (int)Math.floor(num/2) && j == (int) Math.floor(num/2)) {
						System.out.print(" -  ");
					} else {
						System.out.print("*** ");
					}
				}
				System.out.println();
			}
		} else {
			for(int i=0; i<num; i++) {
				for(int j=0; j<num; j++) {
					if(i == 0 || i == num-1) {
						System.out.print("*** ");
					} else {
						if(j == 0 || j == num-1) {
							System.out.print("*** ");
						} else {
							System.out.print(" -  ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}
