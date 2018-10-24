//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("mofancyword.dat"));
		int zz = file.nextInt();
		file.nextLine();
		for(int xx = 0; xx < zz; xx++){
			String line = file.nextLine();
			FancyWordTwo two = new FancyWordTwo(line);
			out.println(two);
		}
	}
}