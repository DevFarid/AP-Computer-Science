//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSummingRunner
{
	public static void main( String args[] ) throws Exception
	{
    	Scanner f = new Scanner( new File( "matsum.dat" ));
    	int times = f.nextInt();
    	MatrixSumming ms = new MatrixSumming();
    	for( int dx = 0; dx < times; dx++ )
    	{
    		int r = f.nextInt();
    		int c = f.nextInt();
    		System.out.println("The sum of " + r + "," + c + " is "  + ms.sum(r+1,c+1) );
    }
	}
}



