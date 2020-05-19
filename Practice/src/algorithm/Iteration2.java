package algorithm;

public class Iteration2 {

	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 5; i += 1) {
			if (i == 0) {
				for (int j = 0; j < 4; j = j + 1) {
					System.out.print(" ");
				}
				System.out.print(num);
			} else if (i == 4) {
				for (int j = 0; j < 9; j = j + 1) {
					num = num + 1;
					System.out.print(num % 10);
				}
			} else {
				for(int j = 0; j < 4 - i; j = j + 1 ) {
					System.out.print(" ");
				}
				num = num + 1;
				System.out.print(num);
				for(int j = 0; j < 2*i -1; j += 1) {
					System.out.print(" ");
				}
				num = num + 1;
				System.out.print(num);
			}
			System.out.print("\n");
			
		}

	}
}
