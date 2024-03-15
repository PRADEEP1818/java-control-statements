package com.controllstatements;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s1=s.next();
		boolean flag=true;
		for(int i=0,last=s1.length()-1;i<=s1.length()/2+1;i++,last--)
		{
			if(s1.charAt(i)!=s1.charAt(last))
			{
				flag=false;
				System.out.println("It is not a PalinDrome");
				break;
			}
			else
			{
				continue;
			}
		}

		if(flag)
			System.out.println("It is a Palindrome");
	}

}
