package algorithm;

public class DataGrouping {

	public static void main(String[] args) {
		// 알고리즘 연습 문제 <1>
		int[][] ar = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < 5; i = i + 1) {
			for (int j = 0; j < 5; j = j + 1) {
				ar[i][j] = cnt;
				cnt = cnt + 1;
			}
		}
		// 하나의 반복문으로 ar의 모든 요소를 출력
		for (int i = 0; i < 25; i = i + 1) {
			System.out.print(ar[i/5][i%5] + "\t");
		}
		System.out.println();
		
		
		int [] k = new int[25];
		cnt = 101;
		for(int i=0; i<25; i=i+1){
			k[i] = cnt;
			cnt = cnt + 1;
			ar[i/5][i%5] = k[i];
			System.out.print(ar[i/5][i%5] + "\t");
		}
		//k의 모든 내용을 ar에 순서대로 대입해서 출력
		
		
		
		
	}

}
