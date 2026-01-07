package com.qa.crm.pages;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {2,6,7,10,12};
		
		System.out.println(Arrays.toString(a));
		
		if (isSorted(a)) {
			
			System.out.println("this is sorted array");		
		}
		
		else {
			
			System.out.println("This is unsorted array");
		}
		
	}

	private static boolean isSorted(int[] a) {
		// TODO Auto-generated method stub
		
		for (int i =0; i<a.length -1 ; i++) {
			
			if (a[i] > a[i+1]) {
				return false;
				
			}
		}
		
		return true;
		
	
	}

}
