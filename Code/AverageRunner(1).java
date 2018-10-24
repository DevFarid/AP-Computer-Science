//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.io.IOException;
import java.io.File;

public class AverageRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("average.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
			String s = file.nextLine();
			Average portal = new Average();
			portal.setLine(s);
			out.println(portal);
		
		}
	}
}