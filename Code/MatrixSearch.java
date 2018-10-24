//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.util.*;
import java.io.*; 
import java.util.Random;

public class MatrixSearch
{
    private int[][] mat;

		/*
		 *pre - mat is null
		 *post - mat will be rows X cols
		 *post - mat will contain integers that are <= upper and >= 1
		 */
    public MatrixSearch( int rows, int cols, int upper )
    {
    	Random randomer = new Random();
    	mat = new int[rows][cols];
    	for(int row=0; row < mat.length; row++) {
    		System.out.println();
    		for(int col=0; col < mat.length; col++) {
    			mat[row][col] = randomer.nextInt(upper) + 1;
    			System.out.print(mat[row][col] + " ");
    		}
    	}
    }
		/*
		 *pre - mat is not null
		 *post - count of odd numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countOdds( )
    {
    	int odd = 0;
    	for(int row = 0; row < mat.length; row++){
    		for(int col=0; col < mat.length; col++)
    			if(mat[row][col] % 2 == 1) {
    				odd++;
    		}
    	}
    	return odd;
    }


		/*
		 *pre - mat is not null
		 *post - count of even numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countEvens( )
    {
    	int evens = 0;
    	for(int row = 0; row < mat.length; row++){
    		for(int col=0; col < mat.length; col++)
    			if(mat[row][col] % 2 == 0) {
    				evens++;
    		}
    	}
    	return evens;
    }


		/*
		 *pre - mat is not null
		 *post - count of prime numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countPrimes( )
    {
    	int prime = 0;
    	for(int row = 0; row < mat.length; row++){
    		for(int col=0; col < mat.length; col++)
    			if(isPrime(mat[row][col])) {
    				prime++;
    		}
    	}
    	return prime;
    }

		/*
		 *pre - num has a value
		 *post - false is returned if num is divisble by any number between 2 and itself
		 *post - true is returned if num is not divisble by any number between 2 and itself
		 */
    private boolean isPrime( int num )
    {
    	for(int i=2; 2 * i < num; i++) {
	    	if(num % i == 0) {
	    		return false;
    		}
    	}	
    	return true;
    }

		/*
		 *pre - mat is not null
		 *post - all values from mat are concatenated to a string and returned
		 */

}
