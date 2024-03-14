package com.controllstatements;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the time of the Day :");
		int time =s.nextInt();
		
		System.out.println("Enter the Median AM or PM:");
		String median =s.next();
		
		if(median.equalsIgnoreCase("pm"))
		{
			time+=12;
		}
				
		if(time==24 && median.equalsIgnoreCase("pm"))
		{
			System.out.println("Good Afternoon Have a good Lunch :) ");
		}
		
	
		
		else if(time>=6 && time<=11)
		{
			System.out.println("Good Morning . Have a Good Day :) ");
		}
		
		else if(time>11 && time<=15)
		{
			System.out.println("Good Afternoon Have a good Lunch :) ");
		}
		
		else if(time>15 && time<=19)
		{
			System.out.println("Good Evening Have a Cup of Coffee:) ");
		}
		
		else
		{
			System.out.println("Good Night ! Go Get Some Sleep zzzzzz");
		}
	}

}
