//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		LoopStats portal = new LoopStats();
		
		portal.setNums(1,5);
		portal.toString();
		
		out.println(portal);
		
		portal.setNums(2,8);
		portal.toString();
		
		out.println(portal);
		
		portal.setNums(5,15);
		portal.toString();
		
		out.println(portal);
		
		
	}
}