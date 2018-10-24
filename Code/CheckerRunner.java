//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class CheckerRunner
{
	public static void main ( String[] args )
	{
		StringChecker demo = new StringChecker("chicken");
		out.println("looking for c "+demo.findLetter('c'));
		out.println("looking for ch "+demo.findSubString("ch"));
		out.println("looking for x "+demo.findSubString("x"));
		out.println(demo);

		demo.setString("alligator");
		out.println("looking for g "+demo.findLetter('g'));
		out.println("looking for all "+demo.findSubString("all"));
		out.println("looking for gater "+demo.findSubString("gater"));
		out.println(demo);

		demo.setString("COMPUTER SCIENCE IS THE BEST!");
		out.println("looking for U "+demo.findLetter('U'));
		out.println("looking for COMP SCI "+demo.findSubString("COMP SCI"));
		out.println("looking for SCIENCE "+demo.findSubString("SCIENCE"));
		out.println(demo);
	}
}