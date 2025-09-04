package com.codegnan.ControlStatements;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum+=digit;
			num=num/10;
		}
		System.out.println("Sum of digits of given Number"+sum);

	}

}
//palindrome
//amstrong
//fibonaciio series
