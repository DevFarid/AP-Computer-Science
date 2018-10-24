//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a :: ");
		int a = keyboard.nextInt();
		
		out.print("Enter b :: ");
		int b = keyboard.nextInt();
		
		out.print("Enter c :: ");
		int c = keyboard.nextInt();
		
		Quadratic test = new Quadratic(a,b,c);
		test.calcRoots();
		test.print();
	}
}