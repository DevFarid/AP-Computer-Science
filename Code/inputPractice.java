/**
 * @(#)inputPractice.java
 *
 *
 * @author 
 * @version 1.00 2014/9/15
 */
import java.util.Scanner;
public class inputPractice {

    	public static void main (String[] args)
	{
		// initiate a scanner named frog
		
		Scanner frog = new Scanner(System.in);
			
		//ask user to input their name and assign it to an appropriate variable

		System.out.println("What is your name? ::");
		String name;
		name = frog.next();

		//ask user to input their date of birth (mm/dd/yyyy) format and assign it to an appropriate variable

		System.out.println("What is your date of birth? ::");
		String dob;
		dob = frog.next();

		//ask user to input their two favorite numbers with decimals and assign it to an appropriate variable

		int favOne, favTwo;
		System.out.println("What is your first favorite numbers? ::");
		favOne = frog.nextInt();
		
		System.out.println("What is your second favorite numbers? ::");
		favTwo = frog.nextInt();		

		//print name, birth date, two favorite numbers, and the sum of those numbers


		System.out.println("---------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Date of birth :" + dob);
		System.out.println("Favorite one " + favOne + "Favorite Two " + favTwo);
		System.out.println("Sum of your favorites numbers " + favOne+favTwo);
		System.out.println("---------------------------------");







	}
}

