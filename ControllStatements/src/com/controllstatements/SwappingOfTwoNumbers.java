package com.controllstatements;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a "+a);
		System.out.println("The value of b "+b);
		System.out.println("the value is Changed");

	}

}
