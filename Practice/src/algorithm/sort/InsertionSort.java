package algorithm.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

	public static void main(String[] args) {
		int idx;
		//List<Integer> list = new ArrayList<>();
		int[] arr = {5, 1, 38, 12, 81, 24, 42, 9, 97, 123, 18, 70, 56, 69};
		/*
		for(int i=0; i<arr.length; i++) {
			list.add(i, arr[i]);
		}
		*/
		for(int i=1; i<arr.length; i++) {
			idx = arr[i];
			for(int j=1; j<=i; j++) {
				if(idx < arr[i-j] && i-j == 0) {
					arr[i-j+1] = arr[i-j];
					arr[i-j] = idx;
				} else if(idx < arr[i-j]){
					arr[i-j+1] = arr[i-j];	
				} else if(idx > arr[i-j] && i-j==1){
					continue;
				} else {
					arr[i-j+1] = idx;
				}
			}
			//System.out.print(arr[i-1] + " ");
		}
		
		
		for(int imsi : arr) {
			System.out.print(imsi + " ");
		}
			  	

	}

}
