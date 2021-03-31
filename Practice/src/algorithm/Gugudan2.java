package algorithm;

import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("구구단의 범위(2~9단)로 지정할 첫번째 숫자를 입력하시오: ");
			int firstNum = sc.nextInt();
			System.out.print("구구단의 범위(2~9단)로 지정할 두번째 숫자를 입력하시오: ");
			int secondNum = sc.nextInt();
			if(firstNum < 2 | firstNum > 9 ) {
				System.out.println("INPUT ERROR!");
				System.out.print("구구단의 범위(2~9단)로 지정할 첫번째 숫자(2~9사이의 숫자)를 입력하시오: ");
				firstNum = sc.nextInt();
			}
			
			if(secondNum < 2 | secondNum > 9 ) {
				System.out.println("INPUT ERROR!");
				System.out.print("구구단의 범위(2~9단)로 지정할 두번째 숫자(2~9사이의 숫자)를 입력하시오: ");
				secondNum = sc.nextInt();
			}
			
				
			if(firstNum < secondNum) {
				while(firstNum<=secondNum) {
					for(int su=1; su<10; su++) {
						System.out.printf("%d * %d = %2d   ", firstNum, su, firstNum*su);
						if(su % 3 == 0) {	
							System.out.println();
						}			
					}
					System.out.println();
					firstNum++;
				}
			} else {
				while(secondNum<=firstNum) {
					for(int su=1; su<10; su++) {
						System.out.printf("%d * %d = %2d   ", firstNum, su, firstNum*su);
						if(su % 3 == 0) {
							System.out.println();
						}
					}
					System.out.println();
					firstNum--;
				}
			}

			/*
			for(int dan=2; dan<10; dan++)
			{
				System.out.println("[" + dan + "]단");
				for(int su=1; su<10; su++)
				{
					System.out.print(dan + "*" + su + "=" + (dan*su) + " ");
				}
				System.out.println();
			}
			*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
