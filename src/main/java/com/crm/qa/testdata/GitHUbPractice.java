package com.crm.qa.testdata;

import java.util.Arrays;

public class GitHUbPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] a1 = {1,2,3,4,5};
	int[] a2 = {6,7,8,9};
	
	
	int[] mergedarray = new int[a1.length + a2.length];
	
	// copy from Array1
	
	for(int i =0; i<a1.length; i++) {
		
		mergedarray[i] = a1[i];
		
		for (int j=0; j<a2.length;j++) {
			
			mergedarray[a1.length + j] = a2[j];
			
		}
	}
	
	System.out.println(Arrays.toString(mergedarray));
	
	
	
	
	
	
			
		}

	

}

