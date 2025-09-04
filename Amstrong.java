package com.codegnan.ControlStatements;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int original=num;
		int power=countOf(num);
		int sum=0;
		while(num>0) {
			 int digit=num%10;
			 sum += Math.pow(digit, power);
			 num=num/10;
		}
		if(sum==original) {
			System.out.println("The Given Number " +original+ " is a amstrong");
		}
		else {
			System.out.println("The Given Number " +original+ " is a amstrong");
		}
		sc.close();
	}
	public static int countOf(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}
}
