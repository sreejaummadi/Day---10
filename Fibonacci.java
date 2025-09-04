package com.codegnan.ControlStatements;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of series you want");
		int n = sc.nextInt();
		int n1 =0 , n2=1;
		for(int i=0;i<=n;i++) {
			System.out.println(n1);
			int next=n1+n2;
			n1=n2;
			n2=next;
		}
		sc.close();
	}

}
