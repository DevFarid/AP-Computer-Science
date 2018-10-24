//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToeRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("tictactoe.dat"));
		int zz = file.nextInt();
		file.nextLine();
		for(int xx = 0; xx < zz; xx++){
			String line = file.nextLine();
			TicTacToe two = new TicTacToe(line);
			out.println(two);
		}		
	}
}