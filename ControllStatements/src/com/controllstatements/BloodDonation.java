package com.controllstatements;

import java.util.Scanner;

public class BloodDonation 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Weight :");
		int Weight = s.nextInt();
		if(Weight>=50)
			System.out.println("You are Eligible For Blood Donation");
	}

}
