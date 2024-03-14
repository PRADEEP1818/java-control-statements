package com.controllstatements;

import java.util.Scanner;

public class CurrentBillCalculation
{
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Unit Used :");
		int unitused =s.nextInt();
		System.out.println("Enter the Cost Per Unit :");
		int oneunitcost=s.nextInt();
		
		int currentbill=unitused*oneunitcost;
		
		System.out.println("Total Bill Value is : "+currentbill);
		
		if(currentbill>300)
			System.out.println("You need To Pay The Current Bill");
		else
			System.out.println("Free Current For You");
		
	}

}
