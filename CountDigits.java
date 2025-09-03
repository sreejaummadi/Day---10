package com.codegnan.ControlStatements;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			//int digit=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);

	}

}
