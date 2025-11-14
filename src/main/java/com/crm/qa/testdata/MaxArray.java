package com.crm.qa.testdata;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int A [] = { 12, 14, 15,16, 20};
		
		int max = A[0];
		
		for (int i =1; i<A.length; i++) {
			
			if (A[i] > max) {
				
				max = A[i];
			}
			
		
			
		}
		
		System.out.println("Largest Number in this array "   + max);

	}

}
