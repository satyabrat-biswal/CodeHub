package com.sb.arrays;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;
 
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
            	
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }
 
        return Arrays.copyOf(uniqueArray, index);
    }
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,3,5,6,7,1};
		int[] r=RemoveDuplicateFromArray.removeDuplicates(arr);
		for(int arrf : r)
		System.out.println(arrf);
		

	}

}
