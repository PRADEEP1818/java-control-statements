package com.controllstatements;

import java.util.Scanner;

public class NestedIfstatement 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		System.out.println("Enter your Weight: ");
		int weight=s.nextInt();
		
		
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("Eligible for Blood Donation");
			}
			
			else
			{
				System.out.println("You are Under 50 KG");
			}
		}
		else
		{
			System.out.println("You are Below 18 Age");

		}
		
	}

}
