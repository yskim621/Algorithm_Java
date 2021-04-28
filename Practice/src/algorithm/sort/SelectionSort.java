package algorithm.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5, 1, 38 , 12, 81, 24, 42, 9, 97};
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i] > arr[i+j]) {
					temp = arr[i];
					arr[i] = arr[i+j];
					arr[i+j] = temp;
				}
			}
		}
		
		for(int imsi : arr) {
			System.out.print(imsi + " ");
		}
		
	}

}
