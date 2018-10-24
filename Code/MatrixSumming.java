//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixSumming
{
    private int[][] m = {{0,0,0,0,0,0,0},{0, 1, 2, 3, 4, 5, 0},{0, 6, 7, 8, 9, 0, 0},{0, 6, 7, 1, 2, 5, 0},{0, 6, 7, 8, 9, 0, 0},{0, 5, 4, 3, 2, 1, 0},{0,0,0,0,0,0,0}};   //load in the matrix values

    public int sum( int r, int c )
    {
    	int sum = 0;
    	for(int row=r-1; row <= r+1; row++) {
    		for(int column=c-1; column <= c+1; column++) {
    			sum+=m[row][column];
    		}
    	}
    	return sum;
    }

    public String toString()
    {
    	return "";
    }
}
