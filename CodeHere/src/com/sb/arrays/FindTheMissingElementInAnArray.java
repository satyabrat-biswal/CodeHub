/*
 * Write Java function called findMissingNumberInArray that takes an integer
 * array containing n-1 unique elements from a range of 1 to n, with one missing
 * number, and returns the missing number.
 * 
 * Example
 * 
 * myArray = {1,2,3,4,6} findMissingNumberInArray(myArray, 6) Output:- 5
 */

package com.sb.arrays;

public class FindTheMissingElementInAnArray {
	
	public static int findTheMissingElement(int arr[]) {
		int n=arr.length+1;
		int expectedSum=(n*(n+1))/2;
		int actulaSum=0;
		
		for(int m:arr) {
			actulaSum+=m;
		}
		return expectedSum-actulaSum;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,5};
		int res= FindTheMissingElementInAnArray.findTheMissingElement(arr);
		System.out.println(res);

	}

}

