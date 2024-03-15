package com.controllstatements;

public class Task 
{
	public static void main(String[] args) 
	{
	
		for(int i=1;i<=50;i++)
		{
			/*if(i%5==0)
			{
				System.out.println("Five");
			}*/
			
			switch(i)
			{
			case 5: System.out.println("Five");
			break;
			
			case 10:System.out.println("Ten");
			break;
			
			case 15:System.out.println("fifteen");
			break;
			
			case 20:System.out.println("Twenty");
			break;
			
			case 25:System.out.println("Twentyfive");
			break;
			
			case 30:System.out.println("Thirty");
			break;
			
			case 35:System.out.println("thirtyfive");
			break;
			
			case 40:System.out.println("fourty");
			break;
			
			case 45:System.out.println("Fourtyfive");
			break;
			
			case 50:System.out.println("fifty");
			break;
			
			default :System.out.println(i);
			}
			
			
		}
	}

}
