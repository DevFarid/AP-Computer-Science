//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
	}
	public TicTacToe(String game)
	{
		mat = new char[3][3];
		int count = 0;
		for(int r=0; r<3; r++){
			for(int c=0; c<3; c++){
					mat[r][c] = game.charAt(count);
					count++;
			}
		}
	}
	public String getWinner()
	{
		char winner = ' ';
		for(int r=0; r < mat.length; r++){
			if((mat[r][0] == mat[r][1]) && (mat[r][1] == mat[r][2])){
				winner = mat[r][0];
				return winner + " wins horizontally!";
			}
			else if((mat[0][r] == mat[1][r]) && (mat[1][r] == mat[2][r])){
				winner = mat[0][r];
				return winner + " wins vertically!";
			}
			else if((mat[0][0] == mat[1][1]) && (mat[1][1] == mat[2][2])){
				winner = mat[0][0];
				return winner + " wins diagonally!";
			}
			else if((mat[2][0] == mat[1][1]) && (mat[1][1] == mat[0][2])){
				winner = mat[2][0];
				return winner + " wins diagonally!";
			}			
		}
			return "cat's game no winner!";
	}
	public String toString()
	{
		String output="";
		for(int r=0; r<3; r++){
			for(int c=0; c<3; c++){
					output+= " " +mat[r][c];
	
			}
			output+="\n";
		}

		return output+getWinner()+"\n";
	}
}