package algorithm.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 38, 12, 81, 24, 42, 9, 97, 123, 18, 70, 56, 69};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					Utils.swapValue(arr, j, j+1);
				}
			}
		}
		
		for(int imsi : arr) {
			System.out.print(imsi + " ");
		}	    
	}
	
	/*
	@Test
    public void test() {
        int[] arr = {2,1,4,0,3};
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = i;
        }
        assertThat(sort(arr), is(sortedArr));
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Utils.swapValue(arr, i, j);
                }
            }
        }
        return arr;
    }
    */
}
