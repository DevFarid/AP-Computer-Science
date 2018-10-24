//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquare1Runner
{
    static int yy;
    static String line;
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("magic1.dat"));
        int count = readInt(file); // read amount of MagicSquare1's to create
        for(int i = 0; i < count; i++) {
            int matrixdim = readInt(file);
            //out.println(matrixdim);
            line = file.nextLine();
            //out.println(line);
            MagicSquare1 one = new MagicSquare1(matrixdim, line);
            out.print(one);
        }    
    }
    
    public static int readInt(Scanner file)
    {
        int result = Integer.parseInt(file.nextLine());
        return result;
    }
}