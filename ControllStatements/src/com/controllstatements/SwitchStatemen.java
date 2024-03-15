package com.controllstatements;

import java.util.Scanner;

public class SwitchStatemen {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String  months=s.next();
		
	switch(months)
	{
	case "jan" : System.out.println("january");
	break;

	case "feb" : System.out.println("february");
	break;
	
	case "mar" : System.out.println("march");
	break;
	
	case "apr" : System.out.println("april");
	break;

	case "may" : System.out.println("may");
	break;
	
	case "june" : System.out.println("june");
	break;
	
	case "jul" : System.out.println("july");
	break;

	case "aug" : System.out.println("august");
	break;
	
	case "sep" : System.out.println("september");
	break;
	
	case "oct" : System.out.println("october");
	break;

	case "nov" : System.out.println("novenber");
	break;
	
	case "dec" : System.out.println("december");
	break;
	
	default :System.out.println("Invalid Selection");
	}
	

	}

}
