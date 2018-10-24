/**
 * @(#)inputPractice.java
 *
 *
 * @author 
 * @version 1.00 2014/9/15
 */

import java.util.Scanner;

public class printFormatPractice
{
	public static void main (String[] args)
	{
		// initiate a scanner named calvin
			
		Scanner calvin = new Scanner(System.in);	
			
		//ask user to input their name, street address, and city,state,zip and assign it to appropriate variables

		String name, street, city, state, zip; 	
		System.out.println("What is your name?");
		name = calvin.next(); 	
			
		System.out.println("What is your street address?");
		street = calvin.next(); 
				
		System.out.println("What is your city?");
		city = calvin.next(); 	
			
		System.out.println("What is your state?");
		state = calvin.next(); 	
			
		System.out.println("What is your zip?");
		zip = calvin.next();


		//ask user to input the number of boxes of chocolate donuts they want to order and assign it to an appropriate variable
			
		int cdonuts;
		
		System.out.println("How many chocolate donuts would you like to order?");
		cdonuts = calvin.nextInt();


		//ask user to input their delivery date (specify format) and assign it to an appropriate variable
		
		String date;
		System.out.println("Delivery date mm/dd/yy");
		date = calvin.next();
		
			
		//calculate the cost—each box costs $7.50
		double calc; 
		calc = cdonuts * 7.50;

		//create a line format for the number output
		//    Name	         Address                                    Delivery Date	  Boxes of Donuts 	Total Cost
		//    Sara Jones     35 Hiawatha St. Westerville, OH  43081	     9/18/2014 	        	10		      $75.00

		String fmt="\n%07d\n%07d\n%07d\n%07d\n%07d\n%07d\n%07d\n%07d\n%07d";
		System.out.printf(fmt,name,street,city,state,zip,cdonuts,date,calc);
	
		
		//print column headings
		
		




		//print information using print and printf per above 
		
	





	}
}


