//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwo
{
	private char[][] mat;

   public FancyWordTwo(String s)
	{
		mat = new char[s.length()][s.length()];
		
		for(int i=0; i < s.length(); i++){
			mat[0][i] = s.charAt(i); // first row
			mat[i][0] = s.charAt(i); // first left row
			mat[i][s.length()-1] = s.charAt(s.length()-i-1); // the right last row
			mat[s.length()-1][i] = s.charAt(s.length()-i-1); // last row
		}

	}

	public String toString()
	{
		String output="";
		for(int r=0; r < mat.length; r++){
			for(int c=0; c < mat[r].length; c++) {
				if(mat[r][c] == 0x0){
					out.println();
					mat[r][c]= ' ';
				}
				output+= " " + mat[r][c];
			}
			output+="\n";
		}
		return output+"\n\n";
	}
}