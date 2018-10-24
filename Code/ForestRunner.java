//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ForestRunner
{
	public static void main( String args[] ) throws IOException
	{
		for( int i = 0; i < 3; i++ )
		{
			Forest woods = new Forest(7, 5);
			System.out.println( woods + "\n\n");
			System.out.println( woods.setTrappedToNull() + "\n\n");
			System.out.println( woods + "\n\n");
		}
	}
}



