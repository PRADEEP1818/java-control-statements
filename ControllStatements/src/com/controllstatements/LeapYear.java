package com.controllstatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year :");
		int year =s.nextInt();
		
		if(year%400==0)
			System.out.println("It is a leap Year ");
		else
			System.out.println("It is a Not leap Year ");

	}

}
