//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
			DogFood portal = new DogFood();
			
			portal.setLine("6 10 14 18 25 32");
			out.println(portal.getAmount());
			out.println(portal.getAmount() + " - 10 POUND BAGS" + "\n");
			
			portal.setLine("12 15 20 26 35 42");
			out.println(portal.getAmount());
			out.println(portal.getAmount() + " - 10 POUND BAGS" + "\n");
			
			portal.setLine("33 38 45 51 60 65");
			out.println(portal.getAmount());
			out.println(portal.getAmount() + " - 10 POUND BAGS" + "\n");
			
			portal.setLine("40 50 60 77 90 101");
			out.println(portal.getAmount());
			out.println(portal.getAmount() + " - 10 POUND BAGS" + "\n");

	}
}