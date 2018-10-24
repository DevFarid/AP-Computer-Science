//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzerRunner
{
	public static void main( String args[] )
	{
		NumberAnalyzer first = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		out.println(first);
		out.println("odd count = "+first.countOdds());
		out.println("even count = "+first.countEvens());
		out.println("perfect count = "+first.countPerfects()+"\n\n\n");

		NumberAnalyzer second = new NumberAnalyzer("5 12 3 7 28 496 81 65 33 11");
		out.println(second);
		out.println("odd count = "+second.countOdds());
		out.println("even count = "+second.countEvens());
		out.println("perfect count = "+second.countPerfects()+"\n\n\n");

		NumberAnalyzer third = new NumberAnalyzer("1 2 3 4 5 6 7 8 11 13 151 16 17 18 19 20");
		out.println(third);
		out.println("odd count = "+third.countOdds());
		out.println("even count = "+third.countEvens());
		out.println("perfect count = "+third.countPerfects()+"\n\n\n");
		
			
	}
}