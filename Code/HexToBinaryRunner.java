//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
		//portal 
		HexToBinary portal = new HexToBinary();
		
		Scanner keyboard = new Scanner(System.in);
		out.println("ENTER A LETTER :: ");
		char let = keyboard.next().charAt(0);	
		
		portal.setHex(let);
		portal.getBinary();
		portal.toString();
		out.println(portal);
	}
}