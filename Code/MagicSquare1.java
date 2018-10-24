//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquare1
{
	private int[][] mat;

	//size the matrix and load in the numbers into the matrix
	//write all nested loop code here in the constructor
	public MagicSquare1(int size, String numbers)
	{
		Scanner chopper = new Scanner(numbers);
		mat = new int[size][size];
		for(int r=0; r < mat.length; r++){
			for(int c=0; c < mat[r].length; c++){
				if(chopper.hasNextInt()){
					mat[r][c] = chopper.nextInt();
				}
			}
		}
	}
	public boolean isMagicSquare()
	{
		for(int row=0; row < mat.length; row++){
			for(int col=0; col < mat[row].length; col++){
				if(sumRow(row) == sumCol(col)) {
					if(sumDownDiag() == sumUpDiag()) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public int sumRow( int r )
	{
		int sum = 0;
		for(int row=r; row < mat.length; row++){
			sum+=mat[row][0];	
		}
		return sum;
	}

	public int sumCol( int c )
	{
		int sum = 0;
		for(int col=c; col < mat[c].length; col++) {
			sum+=mat[0][col];	
		}
		return sum;
	}

	public int sumDownDiag()
	{
		int sum = 0;
		for(int row=0; row < mat.length; row++){
			for(int col=0; col < mat[row].length; col++){
				sum+=mat[row][col];
			}
		}
		return sum;
	}

	public int sumUpDiag()
	{
		int sum = 0;
		for(int row=mat.length-1; row >= 0; row--){
			for(int col=mat[row].length-1; col >= 0; col--){
				sum+=mat[row][col];
			}
		}
		return sum;
	}

	public String toString()
	{
		String output="";
		for(int row=0; row < mat.length; row++){
			for(int col=0; col < mat[row].length; col++){
				output+= " " + mat[row][col];
			}
			output+="\n";
		}
		if(isMagicSquare()) {
			return "\n"+output+" MAGIC SQUARE."+"\n";
		}
		else {
			return "\n"+output+" NOT A MAGIC SQUARE.";
		}
	}
}