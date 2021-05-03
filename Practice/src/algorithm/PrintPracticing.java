package algorithm;

import java.util.Scanner;

public class PrintPracticing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("재구성할 문자열을 입력하시오: ");
		String word = sc.nextLine();
		StringBuilder ch = new StringBuilder();
		StringBuilder num = new StringBuilder();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<word.length(); i++) {
			if((int)word.charAt(i) >= 48 && (int)word.charAt(i) <= 57) {
				num.append(word.charAt(i));
			} else {
				ch.append(word.charAt(i));
			}
		}
		
		if(num.length()+1!=ch.length() && num.length()!=ch.length()+1 && num.length()!=ch.length()) {
			System.out.println("");
		} else {
			for(int i=0; i<Math.ceil(word.length()/2); i++) {
				if(num.charAt(i) != 0) {
					result.append(num.charAt(i));
				}
				if(ch.charAt(i) != 0) {
					result.append(ch.charAt(i));
				}
			}
		}
		
		System.out.println(result.toString());
	}

}
