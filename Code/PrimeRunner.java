//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import java.lang.Math;

public class PrimeRunner
{
	public static void main ( String[] args )
	{
		Prime portal = new Prime();
		
		portal.setPrime(24);
		out.println(portal);
		
		portal.setPrime(7);
		out.println(portal);
		
		portal.setPrime(100);
		out.println(portal);
		
		portal.setPrime(113);
		out.println(portal);
		
		portal.setPrime(65535);
		out.println(portal);
		
		portal.setPrime(2);
		out.println(portal);
		
		portal.setPrime(7334);
		out.println(portal);
		
		portal.setPrime(7919);
		out.println(portal);
		
		portal.setPrime(1115125003);
		out.println(portal);
	}	
}