package com.controllstatements;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = s.nextInt();
		if(age>=18)
		{
			System.out.println("You are Eligible for Voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
	
		
		
	}

}
