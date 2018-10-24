//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		MultTable portal = new MultTable();
		
		portal.setTable(5,5);
		portal.printTable();
		out.println(" ");
		
		portal.setTable(3,7);
		portal.printTable();
		out.println(" ");
		
		portal.setTable(1,6);
		portal.printTable();
		out.println(" ");
		
		portal.setTable(9,9);
		portal.printTable();
		out.println(" ");
		
		portal.setTable(7,8);
		portal.printTable();
		out.println(" ");
		
	}
}