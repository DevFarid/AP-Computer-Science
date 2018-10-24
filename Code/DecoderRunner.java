//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class DecoderRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter to decode :: ");
		char let = keyboard.next().charAt(0);
		
		// portal
		Decoder portal = new Decoder();
		portal.setLetter(let);
		portal.deCode();
		portal.toString();
		out.println(portal);
	}
}