//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class RipperRunner
{
	public static void main ( String[] args )
	{
		StringRipper demo = new StringRipper("chicken");
		out.println(demo.ripString(3,6));
		out.println(demo);
		
		demo.setString("alligator");
		out.println(demo.ripString(3,8));
		out.println(demo);		

		demo.setString("COMPUTER SCIENCE IS THE BEST!");
		out.println(demo.ripString(9,12));
		out.println(demo.ripString(0,12));
		out.println(demo.ripString(5,20));				
		out.println(demo);	

		demo.setString("I like fried chicken and mashed potatoes!");
		out.println(demo.ripString(0,7));
		out.println(demo.ripString(7,15));
		out.println(demo.ripString(15,26));
		out.println(demo.ripString(22,26));						
		out.println(demo);		
	}
}