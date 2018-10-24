//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();


		System.out.print("Enter an double :: ");
		doubleOne = keyboard.nextDouble();


		System.out.print("Enter an double :: ");
		doubleTwo = keyboard.nextDouble();


		System.out.print("Enter an float :: ");
		floatOne = keyboard.nextFloat();


		System.out.print("Enter an float :: ");
		floatTwo = keyboard.nextFloat();


		System.out.print("Enter an short :: ");
		shortOne = keyboard.nextShort();


		System.out.print("Enter an short :: ");
		shortTwo = keyboard.nextShort();

		System.out.println();
		System.out.println("integer one = " + intOne);
		System.out.println("integer two = " + intTwo);
		System.out.println("double one = " + doubleOne);
		System.out.println("double two = " + doubleTwo);		
		System.out.println("float one = " + floatOne);
		System.out.println("float two = " + floatTwo);
		System.out.println("short one = " + shortOne);
		System.out.println("short two = " + shortTwo);




	}
}