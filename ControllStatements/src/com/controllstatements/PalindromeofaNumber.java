package com.controllstatements;

import java.util.Scanner;

public class PalindromeofaNumber {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int r=0;
		int ss=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			ss=(ss*10)+r;
			n=n/10;
		}
		if(ss==temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	
}
