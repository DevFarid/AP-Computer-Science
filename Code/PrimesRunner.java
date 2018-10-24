//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class PrimesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("primes.dat"));
		int size = file.nextInt();
	//	file.nextInt();
		for(int i=0; i<size; i++)
		{
			int s = file.nextInt();
			Prime portal = new Prime();
			portal.setPrime(s);
			out.println(portal);
		
		}		
	}
}