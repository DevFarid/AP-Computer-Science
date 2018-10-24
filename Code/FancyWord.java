//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class FancyWord
{
	private char[][] mat;
   	public FancyWord(final String s)
	{
		mat = new char[s.length()][s.length()];
		
		for(int i=0; i < s.length(); i++){
			mat[0][i] = s.charAt(i); 
			mat[s.length() - 1][i] = s.charAt(i);
			mat[i][i] = s.charAt(i); 
			mat[s.length() - 1 - i][i] = s.charAt(i);
		
		}
	}

	public String toString()
	{
		String output="";
		for(int r=0; r < mat.length; r++){
			for(int c=0; c < mat[r].length; c++){
				if(mat[r][c] == 0x0) {
					out.println();
					mat[r][c] = ' ';
				}
				output+= " " + mat[r][c];
			}
			output+="\n";
		}
		return output;
	}
}