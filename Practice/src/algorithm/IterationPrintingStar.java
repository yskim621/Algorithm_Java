package algorithm;

public class IterationPrintingStar {

	public static void main(String[] args) {
		// 별 찍기 최종 
		for (int i = 0; i < 5; i += 1) {
			if (i == 0) {
				for (int j = 0; j < 4; j = j + 1) {
					System.out.print(" ");
				}
				System.out.print("*");
			} else if (i == 4) {
				for (int j = 0; j < 9; j = j + 1) {
					System.out.print("*");
				}
			} else {
				for(int j = 0; j < 4 - i; j = j + 1 ) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j = 0; j < 2*i -1; j += 1) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.print("\n");
			
		}

	}
}
