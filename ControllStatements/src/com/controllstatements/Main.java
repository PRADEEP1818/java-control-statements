package com.controllstatements;

class Main {
	  public static void main(String[] args) {

			/*
			 * Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
			 * 
			 * if (n1 >= n2) { if (n1 >= n3) { largest = n1; }
			 * 
			 * else { largest = n3; } }
			 * 
			 * else {
			 * 
			 * if (n2 >= n3) { largest = n2; }
			 * 
			 * else { largest = n3; } }
			 * 
			 * System.out.println("Largest Number: " + largest);
			 */
		  
		  int age=18;
		  int kg=50;
		  
		  
		  
		  if(age>=18)
		  {
			  if(kg>=50)
			  {
				  System.out.println("Both Age and Kg are Eligible");
			  }
			  else
			  {
				  System.out.println("only  Age  Eligible");
			  }
		  }
		  else
		  {
			  if(kg>=50)
			  {
				  System.out.println("Only Kg Is Eligible");
			  }
			  else
			  {
				  System.out.println("Both Age and Kg are Not Eligible");
			  }
			  
		  }
			  
	  }
	}
