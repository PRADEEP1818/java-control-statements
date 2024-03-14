package com.controllstatements;

import java.util.Scanner;

public class OddOrEven 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number = s.nextInt();
		if(number%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
