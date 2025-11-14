package com.crm.qa.testdata;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt(); // this method will accepet the value from user
		
		int rev = 0;
		
		while (num!=0) {
			
			
			rev = rev * 10 + num % 10;
			
			num = num/10;
			
		}
		
		System.out.println("reverse number is "  + rev);

	}

}
