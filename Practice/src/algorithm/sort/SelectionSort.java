package algorithm.sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		// 배열 앞부터 기준이 되는 수를 정하고 기준 수와 차례로 비교해서 작은 수를 임시 기억하여
		// 그 작은 수가 현재 위치의 기준 수가 되어 비교를 이어나감
		int idx;
		int temp = 0;
		int[] arr = {5, 1, 38 , 12, 81, 24, 42, 9, 97};
		for(int i=0; i<arr.length; i++) {
			idx = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(idx > arr[j]) {
					// 작은 수가 기준 수로
					idx = arr[j];
					temp = j;
				}
			}
			// 기준 수와 임시 기억 중인 가장 작은 수가 일치 시 pass
			if(arr[i] == idx) {
				continue;
			}
			arr[temp] = arr[i];
			arr[i] = idx;			
		}

		for(int imsi : arr) {
			System.out.print(imsi + " ");
		}
		
	}

}
