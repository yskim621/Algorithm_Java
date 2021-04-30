package algorithm.sort;

public class Utils {
	
	public static int[] swapValue(int[] result, int x, int y) {
		int temp;
		temp = result[x];
		result[x] = result[y];
		result[y] = temp;
		return result;
	}
	
}
