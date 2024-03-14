package com.controllstatements;

import java.util.Scanner;

public class PositiveOrNegative 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number = s.nextInt();
		if(number>0)
		{
			System.out.println("It is a Positive Number");
		}
		else if(number<0)
		{
			System.out.println("It is a Negative Number");
		}	
		else
		{
			System.out.println("It is a zero");
		}
	}

}
