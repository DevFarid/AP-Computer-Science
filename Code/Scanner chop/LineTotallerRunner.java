//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotallerRunner
{
   public static void main( String args[] )
    {
    	LineTotaller portal = new LineTotaller();
    	
    	portal.setLine("1 2 3 4 5 6");
    	out.println(portal);
    	
    	portal.setLine("10 20 30 40 50 60");
    	out.println(portal);
    	
    	portal.setLine("250 657 2154 345 6796");
    	out.println(portal);
    	
    	portal.setLine("0");
    	out.println(portal);
    	
    	portal.setLine("-99 45 -98 92 87");
    	out.println(portal);
	}
}