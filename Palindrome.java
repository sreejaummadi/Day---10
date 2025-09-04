package com.codegnan.ControlStatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int original=num;
		int reverse =0;
		while(original!=0) {
			int digit=original%10;
			reverse=reverse*10+digit;
			original=original/10;
		}
		if(num==reverse) {
			System.out.println("The given number " + num + " Is palindrome");
		}
		else {
			System.out.println("The given Number "+num+ "is not palindrome");
		}
		sc.close();

	}

}
