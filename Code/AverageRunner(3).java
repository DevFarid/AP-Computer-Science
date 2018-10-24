//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner
{
   public static void main( String args[] )
  	 {
  	 	Average portal = new Average();
  	 	
   		Scanner chopper = new Scanner("9 10 5 20");
		while(chopper.hasNextInt())
		{
   			String s = chopper.next();
   			portal.setLine(s);
		}   
			out.println(portal.toString());
   		
//   		Scanner chopper = new Scanner("11 22 33 44 55 66 77");
//   		String s = chopper.nextLine();
//   		portal.setLine(s);
   		
//   		Scanner chopper = new Scanner("48 52 29 100 50 29");
//   		String s = chopper.nextLine();
//  		portal.setLine(s);
   		
//   		Scanner chopper = new Scanner("0");
//   		String s = chopper.nextLine();
//   		portal.setLine(s);
   		
//   		Scanner chopper = new Scanner("100 90 95 98 100 97");
//   		String s = chopper.nextLine();
//   		portal.setLine(s);
  	 }
}