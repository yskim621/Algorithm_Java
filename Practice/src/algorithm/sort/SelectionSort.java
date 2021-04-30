package algorithm.sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		// 배열 앞부터 기준이 되는 수를 정하고 기준 수와 차례로 비교해서 작은 수를 임시 기억하여
		// 그 작은 수가 현재 위치의 기준 수가 되어 비교를 이어나감
		int idx;
		int[] arr = {5, 1, 38 , 12, 81, 24, 42, 9, 97, 123, 18, 70, 56, 69};
		for(int i=0; i<arr.length-1; i++) {
			idx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[idx] > arr[j]) {
					// 작은 수가 기준 수로
					idx = j;
				}
			}
			Utils.swapValue(arr, idx, i);
		}

		for(int imsi : arr) {
			System.out.print(imsi + " ");
		}
		
		/*
	    @Test
	    public void test() {
	        int[] arr1 = {};
	        int[] sortedArr1 = {};
	        assertThat(solution(arr1), is(sortedArr1));
	        int[] arr2 = {6,4,1,8,9,2,7,5,3};
	        int[] sortedArr2 = {1,2,3,4,5,6,7,8,9};
	        assertThat(solution(arr2), is(sortedArr2));
	        int[] arr3 = {1};
	        int[] sortedArr3 = {1};
	        assertThat(solution(arr3), is(sortedArr3));
	    }

	    public int[] solution(int[] arr) {
	        if (arr == null) return null;
	        int[] result = arr;
	        int maxPos;

	        for (int i = 0; i < result.length - 1; i++) {
	            maxPos = i;
	            for (int k = i + 1; k < result.length; k++) {
	                if (result[maxPos] > result[k]) {
	                    maxPos = k;
	                }
	            }
	            result = Utils.swapValue(result, i, maxPos);
	        }
	        return result;
	    }
		*/
		
	}

}
