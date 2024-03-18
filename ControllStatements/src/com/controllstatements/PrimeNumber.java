package com.controllstatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  Prime Number");
		int a=s.nextInt();
		boolean flag=true;
		for(int i =2;i<a;i++)
		{
			if(a%i!=0)
				continue;
			else
			{
				System.out.println("It is Not a Prime Number");
				flag=false;
				break;
			}
		}
		
		if(flag)
			System.out.println("It is a Prime Number");
		
		s.close();

	}

}
