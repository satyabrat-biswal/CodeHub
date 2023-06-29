package com.sb.arrays;

import java.util.HashSet;

public class RemoveDuplicateUsingSet {
	
	public static void removeDuplicate(int arr[]) {
		HashSet<Integer> finalval;
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int ar:arr)
		{
		 hs.add(ar);
		}
		finalval=hs;
		System.out.println(finalval);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,3,5,6,7,1};
		 RemoveDuplicateUsingSet.removeDuplicate(arr);
	    }

}
