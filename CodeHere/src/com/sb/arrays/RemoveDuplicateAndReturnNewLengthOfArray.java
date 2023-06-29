/*Remove Duplicates from Sorted Array
Given a sorted array nums, remove the duplicates in-place such that each element 
appears only once and returns the new length. Do not allocate extra space for 
another array; you must do this by modifying the input array in-place with O(1) 
extra memory.

Example:

Input: nums = [1, 1, 2] 
Output: 2*/

package com.sb.arrays;

public class RemoveDuplicateAndReturnNewLengthOfArray {
	
	public static int removeDuplicate(int num[]) {
		if(num.length==0)
		{
			return 0;
		}
		int i=0;
		for(int j=1;j<num.length;j++)
		{
			if(num[j]!=num[i])
			{
				i++;
			num[i]=num[j];
			}
		}
		
		return i+1;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,4,4,5,6};//here the input array is sorted that's why we get the correct result 
		int arr2[]= {1,2,1,3,4,3,5,6};//here the input array is Not sorted that's why we won't get the correct result 
		System.out.println(RemoveDuplicateAndReturnNewLengthOfArray.removeDuplicate(arr));
		System.out.println(RemoveDuplicateAndReturnNewLengthOfArray.removeDuplicate(arr2));
	}

}