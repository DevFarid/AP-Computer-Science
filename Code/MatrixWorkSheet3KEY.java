//(c) A+ Computer Science
//www.apluscompsci.com

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Character.*;   
import static java.lang.Double.*;

public class MatrixWorkSheet3KEY
{
	//countIt will return the number of times that val occurs in mat
	public static int countIt(int[][] mat, int val)
	{
	int count = 0;
	for(int r=0; r < mat.length; r++) {
		for(int c=0; c < mat[r].length; c++) {
			if(mat[r][c] == val){
				count++;
			}
		}
	}
		return count;
	}

	//countNums will return the number of odd numbers that exist in mat
	public static int countOdds(int[][] mat)
	{
		int count = 0;
		for(int r=0; r < mat.length; r++){
			for(int c=0; c < mat[r].length; c++) {
				if(mat[r][c] % 2 == 1) {
					count++;
				}
			}
		}
		return count;
	}


	public static void main(String[] args)throws Exception
	{
		int[][] m = {{1,2,3,4,5,6},{2,4,3,2,4,3,2}};
		out.println(countIt(m,2));	
		out.println(countOdds(m));	
	}
}