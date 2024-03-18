package com.controllstatements;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) 
	{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number :");
			int n=s.nextInt();
			int n1=0;
			int n2=1;
			int n3=0;
			System.out.println(n1);
			System.out.println(n2);
			
			for(int i =1;i<=n-2;i++)
			{
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
				
			}
			
			//This is Fibonacci Program
			
			
			
	}

}
